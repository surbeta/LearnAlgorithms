package com.surbeta.algorithms.ProgrammingModel1_1;

import edu.princeton.cs.algs4.StdRandom;

public class Exercise1_1_15_2 {

	public static void main(String[] args) {
		//要生成的数组a的长度
		int n = 10;
		//生成的数组ms的长度,统计数组a中第i个元素出现的次数
		int m = 5;
		//生成数组a
		int [] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = StdRandom.uniform(m);
		}
		//打印生成的数组
		System.out.println("生成的数组长度为"+n+",具体内容为:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
		int [] ms = histogram(a, m);
		//打印返回的数组
		System.out.println("");
		System.out.println("返回的数组为:");
		int total = 0;
		for (int i = 0; i < ms.length; i++) {
			System.out.print(ms[i]+"  ");
			total+=ms[i];
		}
		System.out.println("");
		System.out.println("返回的数组之和为"+total);

	}
	
	public static int[] histogram(int[] a,int m){
		int [] ms = new int [m];
		for (int i = 0; i < a.length; i++) {
			ms[a[i]]++;
		}
		return ms;
	}

}
