package com.surbeta.algorithms.ProgrammingModel1_1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_11 {

	public static void main(String[] args) {
		int rows = 5;
		int colums = 5;
		boolean[][] bools = new boolean [rows][colums];
		for(int i = 0;i < rows;i++){
			bools[i][i] = true;
		}
		//打印列号
		StdOut.print("  ");
		for(int i = 0;i< colums;i++){
			StdOut.print((i+1)+" ");
		}
		StdOut.println();
		//开始打印二维布尔数组
		for(int i = 0;i < bools.length; i++){
			//打印行号
			StdOut.print((i+1)+" ");
			for(int j = 0;j< bools[i].length;j++){
				if (bools[i][j]) {
					StdOut.print("*"+" ");
				}else{
					StdOut.print(" "+" ");
				}
				
			}
			StdOut.println();
		}
	}

}
