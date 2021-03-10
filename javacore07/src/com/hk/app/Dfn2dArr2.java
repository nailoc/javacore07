package com.hk.app;

public class Dfn2dArr2 {

	public static void main(String[] args) {
		
		// 2차원선언
		int[][] matrix_1 = { // new int[3][3] 3*3 배열
				{3,2,1},
				{4,5,6},
				{3,5,7}
		};
		
		int[][] matrix_2 = {
				{2,3,4},
				{4,3,6},
				{3,4,7}
		};
		
		// matrix_1 + matrix_2 = ? //같은 행과열의 값을 서로 더한다
		int[][] result = new int[3][3];
		for(int r=0; r<3; r++ ) {
			for(int c=0; c<3; c++) {
				result[r][c] =matrix_1[r][c] + matrix_2[r][c];
				
				System.out.print(result[r][c]+" ");
			}
			System.out.println();
		}

	}

}
