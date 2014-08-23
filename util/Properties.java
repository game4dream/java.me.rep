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
	 * Ĭ��ֵΪnull
	 * @param file �����ļ���
	 * @param name ������
	 * @return ����ֵ
	 */
	public static String getS(String file, String name) {
		return getString(file, name, null);
	}
	
	/**
	 * Ĭ��ֵΪnull
	 * @param file �����ļ���
	 * @param name ������
	 * @return ����ֵ
	 */
	public static Integer getI(String file, String name) {
		return getInteger(file, name, null);
	}
	
	/**
	 * Ĭ��ֵΪnull
	 * @param file �����ļ���
	 * @param name ������
	 * @return ����ֵ
	 */
	public static Long getL(String file, String name) {
		return getLong(file, name, null);
	}
	
	/**
	 * @param file �����ļ���
	 * @param name ������
	 * @param defaultVal Ĭ��ֵ
	 * @return ����ֵ
	 */
	public static Integer getInteger(String file, String name, Integer defaultVal) {
		Object o = get(file, name, defaultVal == null ? null : String.valueOf(defaultVal));
		return o == null ? null : Integer.valueOf(o.toString());
	}
	
	/**
	 * @param file �����ļ���
	 * @param name ������
	 * @param defaultVal Ĭ��ֵ
	 * @return ����ֵ
	 */
	public static Long getLong(String file, String name, Long defaultVal) {
		Object o = get(file, name, defaultVal == null ? null : String.valueOf(defaultVal));
		return o == null ? null : Long.valueOf(o.toString());
	}
	
	/**
	 * @param file �����ļ���
	 * @param name ������
	 * @param defaultVal Ĭ��ֵ
	 * @return ����ֵ
	 */
	public static String getString(String file, String name, String defaultVal) {
		return get(file, name, defaultVal) == null ? null : get(file, name, defaultVal).toString();
	}
	
	/**
	 * ȡ�����ļ�
	 * @param file �����ļ���
	 * @param name ������
	 * @param defaultVal ����Ĭ��ֵ���������ļ������ڣ�key������ʱʹ��Ĭ��ֵ
	 * @return ����ֵ
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
	 * ��֤�����ļ�����޸�ʱ��
	 * @param filePath ����·��
	 * @return ��ǰ�����ļ��Ƿ����
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
				// �¾������ļ���������
				System.err.println(filePath + " file does not exist!");
			} else {
				// �������ļ�û�и���ʱ�䣬�������ļ��ѱ�ɾ��
				System.err.println(filePath + " file was deleted!!");
			}
			return false;
		} else if (newTime > lastTime) {
			// �������ļ��޸�ʱ��Ⱦɵ����������ļ����޸�
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
	 * �������������ļ�
	 * @param filePath �����ļ�·��
	 * @throws Exception �쳣
	 */
	synchronized private static void reload(String filePath, String fileName) throws Exception {
		// �ٴ���֤�޸�ʱ�䣬��ֹ����ʱ����ظ�load
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