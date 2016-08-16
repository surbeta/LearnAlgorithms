package com.surbeta.algorithms.ProgrammingModel1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_9 {

	public static void main(String[] args) {
		StdOut.println("please enter number:");
		int i = StdIn.readInt();
		String binaryString = "";
		for(int n = i;n > 0 ;n /= 2){
			binaryString = n % 2 + binaryString;
		}
		StdOut.println("binary string:");
		StdOut.println(binaryString);
		
	}

}
