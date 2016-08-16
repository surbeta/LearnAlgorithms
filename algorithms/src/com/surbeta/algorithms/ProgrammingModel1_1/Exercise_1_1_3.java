package com.surbeta.algorithms.ProgrammingModel1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_3 {

	public static void main(String[] args) {
		int [] numbers = new int [3];
		StdOut.println("please enter number 1:");
		numbers[0] = StdIn.readInt();
		StdOut.println("please enter number 2:");
		numbers[1] = StdIn.readInt();
		StdOut.println("please enter number 3:");
		numbers[2] = StdIn.readInt();
		if (numbers[0] == numbers[2] && numbers[0] == numbers[1]) {
			StdOut.println("equal");
		}else{
			StdOut.println("not equal");
		}
	}
}
