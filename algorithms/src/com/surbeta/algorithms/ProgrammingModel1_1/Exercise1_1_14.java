package com.surbeta.algorithms.ProgrammingModel1_1;

public class Exercise1_1_14 {

	public static void main(String[] args) {
		System.out.println(lg(17));
		
	}
	//����һ�����β���N,���ز�����log2N���������.����ʹ��Math��.
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
