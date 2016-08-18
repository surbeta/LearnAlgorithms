package com.surbeta.algorithms.ProgrammingModel1_1;

import edu.princeton.cs.algs4.StdRandom;

public class Exercise1_1_15_2 {

	public static void main(String[] args) {
		//Ҫ���ɵ�����a�ĳ���
		int n = 10;
		//���ɵ�����ms�ĳ���,ͳ������a�е�i��Ԫ�س��ֵĴ���
		int m = 5;
		//��������a
		int [] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = StdRandom.uniform(m);
		}
		//��ӡ���ɵ�����
		System.out.println("���ɵ����鳤��Ϊ"+n+",��������Ϊ:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
		int [] ms = histogram(a, m);
		//��ӡ���ص�����
		System.out.println("");
		System.out.println("���ص�����Ϊ:");
		int total = 0;
		for (int i = 0; i < ms.length; i++) {
			System.out.print(ms[i]+"  ");
			total+=ms[i];
		}
		System.out.println("");
		System.out.println("���ص�����֮��Ϊ"+total);

	}
	
	public static int[] histogram(int[] a,int m){
		int [] ms = new int [m];
		for (int i = 0; i < a.length; i++) {
			ms[a[i]]++;
		}
		return ms;
	}

}
