package com.surbeta.algorithms.ProgrammingModel1_1;

public class Exercise1_1_15 {

	public static void main(String[] args) {
		int[] a = {1,2,2,1,1,5,2,3,4,5,4,3,3,2,2,2,2};
		int m = 6;
		int [] ms = histogram(a, m);
		int total = 0;
		for (int i = 0; i < ms.length; i++) {
			total += ms[i];
		}
		System.out.println(total == a.length);

	}
	
	public static int[] histogram(int[] a,int m){
		int [] ms = new int [m];
		for (int i = 0; i < ms.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					count++;
				}
			}
			ms[i] = count;
		}
		return ms;
	}

}
