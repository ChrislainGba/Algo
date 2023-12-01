package com.xl1.matrix;

import java.util.Iterator;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix3d = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {0, 8, 9}
	        };
		
		int[][] res = replceElements(matrix3d);
		for(int[] data : res) {
			for (int i = 0; i < res.length; i++) {
				System.out.print(data[i] + ",");
			}
			System.out.println("");
		}
	}
	public static int[][] replceElements(int[][] matrix){
		int[][] modified = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int element = matrix[i][j];
				if(element > 0 && element % 2 == 0) {
					modified[i][j] = (int)'$';
				}else if(element > 0 && element%2 != 0) {
					modified[i][j] = (int)'*';
				}else if(element == 0) {
					modified[i][j] = (int)'%';
				}else {
					modified[i][j] = matrix[i][j];
				}
				
			}
		}
		return modified;
	}

}
