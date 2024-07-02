package com.student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Board1Project {
	
	

	public static void main(String[] args) {
		System.out.println("게시판 프로그램 시작");
		
		Board1Service boardService = new Board1Service();		// 게시판 접근 및 제어 객체 생성
		Scanner scanner = new Scanner(System.in);				// 키보드입력을 받는 객체
		
		// 0. 게시판 프로그램 대기를 위해 무한루프 코드 작성
		while(true) {
			// 게시판 제목
			System.out.println("                  << 게시판 >>");
			// 게시판 메뉴
			System.out.println("(1.글작성, 2.글목록, 3.상세보기, 4.수정, 5.삭제, 6.종료)>>	");
			
		//1. 메뉴선택번호를 입력받기
			int menuNumber =0;
			while(true) {
			try {
				menuNumber = Integer.parseInt(scanner.nextLine());
				if (menuNumber>6 |menuNumber<1 ) {
					System.out.println("1번~6번 중에 입력해주세요");
				}else {
					System.out.println("선택된 번호 -> " +menuNumber );
					break;
				}
					
			}catch(InputMismatchException | NumberFormatException e) {
				System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요");
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("알 수 없는 오류. ->" + e.getMessage());
			}		
			}
			
			switch (menuNumber) {
			
			case 1:	//글작성 실행
			System.out.println("(글작성)");
			boardService.insertBoard();
				break;
			case 2:		//글목록
			System.out.println("(글목록)");
			boardService.selectAllBoard();
				break;
			case 3:		//상세보기
			System.out.println("(상세보기)");
			boardService.selectOneBoard();
				break;
			case 4:		//수정
			System.out.println("(글수정)");
			boardService.updateBoard();
				break;
			case 5:		//삭제	
			System.out.println("(글삭제)");
			boardService.deleteBoard();
				break;
		}
		if (menuNumber==6) {	//6번일때는 무한루프를 빠져나가게 하여 프로그램을 종료
			System.out.println("(종료)");
			break;
		}
		
		}
		
		
		//프로그램 종료 표시
		System.out.println("게시판 프로그램 종료");
		
		
		
	
		

	}

}
