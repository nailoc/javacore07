package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		
		// 삼각형을 출력하시오
		String[][] semo1 = new String[5][5];
		String[][] semo2 = new String[5][5];
		String[][] semo3 = new String[5][5];
		String[][] semo4 = new String[5][5];
		
		// 1번째
		for(int r=0; r<5; r++) {
			
			for(int c=4; c>r; c--) {
				System.out.print(" ");
			}
			for(int c=0; c<=r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 2번째
		for(int r=0; r<5; r++) {
			for(int c=0; c<=r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 3번째
		
		// 4번째
		

	}

}
