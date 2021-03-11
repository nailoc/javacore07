package com.hk.app;

public class Sav2dArr3 {

	public static void main(String[] args) {
		
		int[][] matrix = { 
				{1,2,3,4,5},
				{10,9,8,7,6},
				{11,12,13,14,15}, 
				{20,19,18,17,16},
				{21,22,23,24,25}
		};   
	
		//맨위의 가로의 합
		int row=0;
		int sum_top = 0;
		for(int c=0; c<matrix[0].length; c++) {
			sum_top += matrix[row][c];
		}
		System.out.println("맨상단의 열의 합은:"+sum_top);
		//맨왼쪽 세로의 합
		int col=0;
		int sum_left=0;
		for(int r=0; r<matrix.length; r++) {
			sum_left += matrix[r][col];
		}
		System.out.println("맨왼쪽의 행의 합은:"+sum_left);
		// 대각선의 합
		int sum_digo1=0;
		for(int r=0; r<matrix.length; r++) {
			for(int c=0; c<matrix[0].length; c++) {
				if(r==c) {
					sum_digo1 += matrix[r][c];
				}
			}
		}
		System.out.println("대각선1 합은:"+sum_digo1);
		//반대 대각선의 합
		row=matrix.length-1; // -1
		col=0; // +1
		int sum_digo2=0;
		for(int i=0; i<matrix.length; i++) {
			sum_digo2 += matrix[row][col];
			row--;
			col++;
		}
		System.out.println("대각선2합은:"+sum_digo2);

	}

}
