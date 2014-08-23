import java.io.File;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author chenming
 *
 */
public class Util {

	private static Map<String, File> fileMap;
	private static Map<String, Long> timeMap;
	private static Map<String, Properties> propertiesMap;
	
	static {
		fileMap = new HashMap<String, File>();
		timeMap = new HashMap<String, Long>();
		propertiesMap = new HashMap<String, Properties>();
	}
	
	private Util() {}
	
	/**
	 * 默认值为null
	 * @param file 配置文件名
	 * @param name 配置名
	 * @return 配置值
	 */
	public static String getS(String file, String name) {
		return getString(file, name, null);
	}
	
	/**
	 * 默认值为null
	 * @param file 配置文件名
	 * @param name 配置名
	 * @return 配置值
	 */
	public static Integer getI(String file, String name) {
		return getInteger(file, name, null);
	}
	
	/**
	 * 默认值为null
	 * @param file 配置文件名
	 * @param name 配置名
	 * @return 配置值
	 */
	public static Long getL(String file, String name) {
		return getLong(file, name, null);
	}
	
	/**
	 * @param file 配置文件名
	 * @param name 配置名
	 * @param defaultVal 默认值
	 * @return 配置值
	 */
	public static Integer getInteger(String file, String name, Integer defaultVal) {
		Object o = get(file, name, defaultVal == null ? null : String.valueOf(defaultVal));
		return o == null ? null : Integer.valueOf(o.toString());
	}
	
	/**
	 * @param file 配置文件名
	 * @param name 配置名
	 * @param defaultVal 默认值
	 * @return 配置值
	 */
	public static Long getLong(String file, String name, Long defaultVal) {
		Object o = get(file, name, defaultVal == null ? null : String.valueOf(defaultVal));
		return o == null ? null : Long.valueOf(o.toString());
	}
	
	/**
	 * @param file 配置文件名
	 * @param name 配置名
	 * @param defaultVal 默认值
	 * @return 配置值
	 */
	public static String getString(String file, String name, String defaultVal) {
		return get(file, name, defaultVal) == null ? null : get(file, name, defaultVal).toString();
	}
	
	/**
	 * 取配置文件
	 * @param file 配置文件名
	 * @param name 配置名
	 * @param defaultVal 配置默认值，当配置文件不存在，key不存在时使用默认值
	 * @return 配置值
	 */
	private static Object get(String file, String name, Object defaultVal) {
		String filePath = Util.class.getClassLoader().getResource("").getPath().replaceAll("%20", " ");
		String fileName = file + ".properties";
		filePath += fileName;
		
		Object val = null;
		if (checkModified(filePath, fileName)) {
			val = propertiesMap.get(filePath).get(name);
		}
		if (val == null) {
			return defaultVal;
		} else {
			return val;
		}
	}
	
	/**
	 * 验证配置文件最后修改时间
	 * @param filePath 配置路径
	 * @return 当前配置文件是否存在
	 */
	private static boolean checkModified(String filePath, String fileName) {
		
		if (!timeMap.containsKey(filePath)) {
			fileMap.put(filePath, new File(filePath));
			timeMap.put(filePath, 0l);
		}
		
		long newTime = fileMap.get(filePath).lastModified();
		long lastTime = timeMap.get(filePath);
		
		if (newTime == 0) {
			if (lastTime == 0) {
				// 新旧配置文件都不存在
				System.err.println(filePath + " file does not exist!");
			} else {
				// 新配置文件没有个性时间，及配置文件已被删除
				System.err.println(filePath + " file was deleted!!");
			}
			return false;
		} else if (newTime > lastTime) {
			// 新配置文件修改时间比旧的晚，及配置文件有修改
			if (propertiesMap.containsKey(filePath)) {
				propertiesMap.get(filePath).clear();
			} else {
				propertiesMap.put(filePath, new Properties());
			}
			try {
				reload(filePath, fileName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	/**
	 * 重新载入配置文件
	 * @param filePath 配置文件路径
	 * @throws Exception 异常
	 */
	synchronized private static void reload(String filePath, String fileName) throws Exception {
		// 再次验证修改时间，防止并发时多次重复load
		long newTime = fileMap.get(filePath).lastModified();
		long lastTime = timeMap.get(filePath);
		if (newTime > lastTime) {
			propertiesMap.get(filePath).load(new InputStreamReader(Util.class.getClassLoader().getResourceAsStream(fileName), "UTF-8"));
			timeMap.put(filePath, newTime);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println(Util.getS("init", "ips"));
			Thread.sleep(1000);
		}
	}
	
}