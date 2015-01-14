package com.aganzo.algorithm;

public class Prim {

	private static final int M = -1;
	
	public static void main(String[] args) {
		int[][] graph = { 
				{ M, 6, 1, 5, M, M }, 
				{ 6, M, 5, M, 3, M },
				{ 1, 5, M, 5, 6, 4 }, 
				{ 5, M, 5, M, M, 2 },
				{ M, 3, 6, M, M, 6 }, 
				{ M, M, 4, 2, 6, M } 
				};
		prim(graph, 0, graph.length);
	}

	/**
	 * 求图最小生成树的PRIM算法 基本思想：假设N=(V,{E})是联通网，TE是N上的最想生成树中的变得集合。算法从U={u0}(u0属于V)，
	 * TE={}开始，重复执行下述操作：在所有的u属于U，v属于V-U的边（u，v）属于E中找到一条代价最小
	 * 的边（u0，v0）并入集合TE，同事v0并入U，直至U=V为止。此时TE中必有n-1条边，则T=(V,{TE}) 为N的最小生成树。
	 * 
	 * @param graph 图
	 * @param start 开始节点
	 * @param n 	图中节点数
	 */
	public static void prim(int[][] graph, int start, int n) {
		/* 用于保存集合U到V-U之间的最小边和它的值，mins[i][0]值表示到该节点i边的起始节点
		 * 值为-1表示没有到它的起始点，mins[i][1]值表示到该边的最小值，
		 * mins[i][1]=0表示该节点已将在集合U中
		 */
		int[][] mins = new int[n][2];
		// 初始化mins
		for (int i = 0; i < n; i++) {
			if (i == start) {
				mins[i][0] = -1;
				mins[i][1] = 0;
			} else if (graph[start][i] != -1) { // 说明存在（start，i）的边
				mins[i][0] = start;
				mins[i][1] = graph[start][i];
			} else {
				mins[i][0] = -1;
				mins[i][1] = Integer.MAX_VALUE;
			}
		}
		for (int i = 0; i < n - 1; i++) {
			int minV = -1;
			int minW = Integer.MAX_VALUE;
			for (int j = 0; j < n; j++) { // 找到mins中最小值，使用O(n^2)时间
				if (mins[j][1] != 0 && minW > mins[j][1]) {
					minW = mins[j][1];
					minV = j;
				}
			}
			mins[minV][1] = 0;
			System.out.println("最小生成树的第" + i + "条最小边=<" + (mins[minV][0] + 1) + "," + (minV + 1) + ">，权重=" + minW);
			for (int j = 0; j < n; j++) { // 更新mins数组
				if (mins[j][1] != 0) {
					if (graph[minV][j] != -1 && graph[minV][j] < mins[j][1]) {
						mins[j][0] = minV;
						mins[j][1] = graph[minV][j];
					}
				}
			}
		}
	}

}