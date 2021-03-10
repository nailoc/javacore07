package com.hk.app;

import java.util.Scanner;

public class Try2dArr1 {

	public static void main(String[] args) {
		// 조건 - 홀수인 경우
		
		// 1번-N을 입력하시오
		// 2번-N*N 행렬(배열) 생성한다
		// 3번-0행 N/2열 배열에 1값을 대입
		// 4번-배열을 출력한다
		
		// 1번
		Scanner reader = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하시오(단 홀수):");
		int N = reader.nextInt();
		System.out.println("배열의 가로세로 크기는: "+N);
		
		// 2번
		int[][] turtle = new int[N][N];
		
		// 3번
		
		int row = 0;
		int col = N/2;
		
		for(int i=1; i<=N*N; i++) { // i 대입을 값
		
			turtle[row][col] = i;
			
			if(i%N==0) { // N의 배수인경우
				row++;
			}else {
				//좌표가 상단과 우측 대각선으로 이동한다
				row--;
				col++;
				//좌표가 배열을 벗어날 경우
				if(row<0) {
					row=N-1;
				}
				if(col>=N) {
					col = 0;
				}
			}
			
		}
		
		// 4번
		for(int r=0; r<N; r++) {
			for(int c=0; c<N; c++) {
				if(turtle[r][c]<10)
					System.out.print(" " + turtle[r][c]+" ");
				else
					System.out.print(turtle[r][c]+" ");
			}
			System.out.println();
		}

	}

}
