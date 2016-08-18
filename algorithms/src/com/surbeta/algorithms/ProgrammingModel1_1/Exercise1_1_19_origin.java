package com.surbeta.algorithms.ProgrammingModel1_1;

public class Exercise1_1_19_origin {

	public static void main(String[] args) {
		//在一个小时以后显示到了55
		for (int i = 0; i < 100; i++) {
			System.out.println(i+"  "+F(i));
		}

	}
	public static long F(int n){
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return F(n-1)+F(n-2);
	}

}
