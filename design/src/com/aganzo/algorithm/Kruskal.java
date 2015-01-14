package com.aganzo.algorithm;
	
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
	
public class Kruskal {
	
	public static void main(String[] args) {
		int[] vertexs = { 1, 2, 3, 4, 5, 6 }; // 顶点集
		Edge[] edges = new Edge[10]; // 边集
		edges[0] = new Edge(1, 2, 6);
		edges[1] = new Edge(1, 3, 1);
		edges[2] = new Edge(1, 4, 5);
		edges[3] = new Edge(2, 3, 5);
		edges[4] = new Edge(2, 5, 3);
		edges[5] = new Edge(3, 4, 5);
		edges[6] = new Edge(3, 5, 6);
		edges[7] = new Edge(3, 6, 4);
		edges[8] = new Edge(4, 6, 2);
		edges[9] = new Edge(5, 6, 6);
		kruskal(vertexs, edges);
	}
	
	/**
	 * 求最小树的Kruskal算法 算法思想：克鲁斯卡尔算法从另一个途径求网中的最小生成树。假设联通网N=(V,{E})，则令
	 * 最小生成树的厨师状态为只有n个顶点而无边的非连通图T=(V,{})，途中每个顶点自称一个连通分量。
	 * 在E中选择代价最小的边，若该边衣服的顶点落在T中不同的连通分量上，则将此边加入到T中，否则舍去此边
	 * 而选择下一条最小的边。以此类推，直至T中所有的顶点都在同一连通分量上为止。
	 * 
	 * @param vertex 图中的节点集合
	 * @param edges 图中边的集合
	 */
	public static void kruskal(int[] vertex, Edge[] edges) {
		
		Arrays.sort(edges);// 将边按照权重w升序排序
		System.out.println("++++++++++++++++++++++排序后");
		for (Edge edge : edges) {
			System.out.println("++++" + "start=" + edge.start + "||end=" + edge.end + "||w=" + edge.weight);
		}
		
		List<Set<Integer>> sets = new ArrayList<Set<Integer>>(); // 存放已加入的点
		for (int i = 0; i < vertex.length; i++) {
			Set<Integer> set = new HashSet<Integer>();
			set.add(vertex[i]);
			sets.add(set);
		}

		System.out.println("++++++++++++++++++++++size=" + sets.size());
		
		for (int i = 0; i < edges.length; i++) { // 遍历边集
			int start = edges[i].start;
			int end = edges[i].end;
			int sTmp = -1, eTmp = -2;

			for (int j = 0; j < sets.size(); j++) { // 遍历点集
				Set<Integer> set = sets.get(j);
				if (set.contains(start)) {
					sTmp = j;
				}
				if (set.contains(end)) {
					eTmp = j;
				}
			}
			
			if (sTmp < 0 || eTmp < 0) {
				System.err.println("没有在子树中找到节点，错误");
			}

			if (sTmp != eTmp) {
				System.out.println("输出start=" + start + "||end=" + end + "||w=" + edges[i].weight);
				Set<Integer> setj = sets.get(eTmp);
				sets.remove(eTmp);
				Set<Integer> seti = sets.get(sTmp);
				sets.remove(sTmp);
				seti.addAll(setj);
				sets.add(seti);
			} else {
				System.out.println("他们在一棵子树中，不能输出start=" + start + "||end=" + end + "||w=" + edges[i].weight);
			}
		}
	}
}

class Edge implements Comparable<Object> {
	
	public int start, end, weight;
	
	public Edge(int start, int end, int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Object o) {
		Edge to = (Edge) o;
		if (this.weight > to.weight) {
			return 1;
		} else if (this.weight == to.weight) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "start=" + start + "||end=" + end + "||w=" + weight;
	}
}
