package com.surbeta.algorithms.ProgrammingModel1_1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_18 {

	public static void main(String[] args) {
		int result1 = mystery1(2, 25);
		int result2 = mystery1(3, 11);
		System.out.println("mystery(2,25):"+result1+" mystery1(3, 11):"+result2);

	}
	
	//使用了 https://github.com/aistrate/AlgorithmsSedgewick/blob/master/1-Fundamentals/1-1-BasicProgModel/Ex_1_1_18.java 的代码
	public static int mystery1(int a, int b)
    {
        StdOut.printf("%3d, %3d\n", a, b);
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery1(a+a, b/2);
        return mystery1(a+a, b/2) + a;
    }
    
    public static int mystery2(int a, int b)
    {
        StdOut.printf("%7d, %3d\n", a, b);
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a*a, b/2);
        return mystery2(a*a, b/2) * a;
    }

}
