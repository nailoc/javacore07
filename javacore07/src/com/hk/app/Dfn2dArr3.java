package com.hk.app;

public class Dfn2dArr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			
			// matrix_1, matrix_2
			// 대각선 (좌측상단->우측하단)
			// 각각 합계를 구하시오
			int sum1=0, sum2=0;
			for(int r=0; r<3; r++) {
				for(int c=0; c<3; c++) {
					if(r==c) {
						sum1+=matrix_1[r][c];
						sum2+=matrix_2[r][c];
					}
				}
			}
			System.out.println(sum1);
			System.out.println(sum2);
	}

}
