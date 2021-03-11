package com.hk.app;

public class ExMainClass {

	public static void main(String[] args) {
		
		//보드의 정보 ExBoardClass
		//1 가로크기 : 정수 width
		//2 세로크기 : 정수 height
		// 클래스로 참조변수를 선언한 부분
		ExBoardClass gamebd = new ExBoardClass();
		gamebd.width = 20;
		gamebd.height = 20;
		
		//말의 정보 : ExHorseClass
		//1 말의 색상 : char color = "r, b, g, y"
		//2 말의 번호 : int no = 1 2 3 4
		// 클래스로 참조변수를 선언한 부분
		ExHorseClass redH = new ExHorseClass();
		ExHorseClass greH = new ExHorseClass();
		redH.color = 'r'; redH.no = 3;
		greH.color = 'g'; greH.no = 2;
		
		// 보드 사이즈와 두개의 말의 정보를 출력하시오
		System.out.println("보드사이즈는:"+gamebd.width
				           +"x"+gamebd.height);
		System.out.println("빨간색말:"+redH.color+"-"+redH.no);
		System.out.println("빨간색말:"+greH.color+"-"+greH.no);

	}

}
