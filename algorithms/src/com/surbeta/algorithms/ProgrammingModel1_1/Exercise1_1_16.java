package com.surbeta.algorithms.ProgrammingModel1_1;

public class Exercise1_1_16 {

	public static void main(String[] args) {
		System.out.println(exR1(6));
		//½á¹û 311361142246

	}
	public static String exR1(int n){
		if(n <= 0) return "";
		return exR1(n-3)+n+exR1(n-2)+n;
	}
}
