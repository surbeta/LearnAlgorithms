package com.surbeta.algorithms.ProgrammingModel1_1;

public class Exercise1_1_13 {

	public static void main(String[] args) {
		int[][] nums = new int[4][3];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = j + 1;
			}
		}
		System.out.println(nums[0][2]);
		nums = transpose(nums);
		System.out.println(nums[0][2]);
		
		
		

	}
	//¿ªÊ¼×ªÖÃ
	public static int[][] transpose(int[][] i){
		int rows = i.length;
		int columns = 0;
		if (i.length != 0) {
			columns = i[0].length;
		}
		int[][] newnums = new int[columns][rows];
		for (int j = 0; j < newnums.length; j++) {
			for (int j2 = 0; j2 < newnums[0].length; j2++) {
				newnums[j][j2] = i[j2][j];
			}
		}
		return newnums;
		
	}

}
