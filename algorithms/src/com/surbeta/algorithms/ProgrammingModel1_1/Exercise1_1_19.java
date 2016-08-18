package com.surbeta.algorithms.ProgrammingModel1_1;

public class Exercise1_1_19 {

	public static void main(String[] args) {
		long [] fs = new long [100];
		for (int i = 0; i < 100; i++) {
			fs[i] = F(i,fs);
			System.out.println(i+"  "+fs[i]);
		}

	}
	public static long F(int n,long [] fs){
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fs[n-1]+fs[n-2];
	}

}
