package com.hk.app;

public class Save2dArr2 {

	public static void main(String[] args) {
		
		int[][] matrix2 = new int[5][5];
		int[][] result2 = new int[5][5];
		//pt 내용처럼 1-25까지 저장해서 출력하시오
		int row = matrix2.length; // 5
		int col = matrix2[0].length; //같은 열의 길이 일때 5
		
		int num=1;
		
		for(int r=0; r<row; r++) {
			if(r%2==0) {  // 짝수행 0 2 4
				for(int c=0; c<col; c++) {
					result2[r][c] = num++;
				}
			}else {      // 홀수행 1 3
				for(int c=col-1; c>=0; c--) {
					result2[r][c] = num++;
				}
			}
		}
		
		// 출력
		for(int r=0; r<row; r++) {
			for(int c=0; c<col; c++) {
				if(result2[r][c]<10) 
					System.out.print(" "+result2[r][c]+" ");
				else
					System.out.print(result2[r][c]+" ");
			}
			System.out.println();
		}

	}

}
