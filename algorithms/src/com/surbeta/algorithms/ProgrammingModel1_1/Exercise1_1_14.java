package com.surbeta.algorithms.ProgrammingModel1_1;

public class Exercise1_1_14 {

	public static void main(String[] args) {
		System.out.println(lg(17));
		
	}
	//接受一个整形参数N,返回不大于log2N的最大整数.不能使用Math库.
	public static int lg(int N){
		int total = 1;
		int count = 0;
		while(total < N){
			total *= 2;
			count++;
		}
		return count-1;
	}

}
