package sec02;

import java.util.Scanner;
public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4번 문제
		int pensils = 534;
		int students = 30;
		int pensilsPerstudents = pensils / students;
		System.out.println(pensilsPerstudents);
		
		int pencilsLeft = pensils % students;
		System.out.println(pencilsLeft);

		// 5번 문제
		int val1 = 5;
		int val2 = 2;
		double val3 = (double)val1 / val2;
		double val4 = val3*val2;
		System.out.println(val4);
		
		
		//6번 문제
		int value = 356;
		System.out.println((value/100)*100); //356 / 100 -> 3.56 두 연산자가 int 이기 때문에 소수점은 버려짐
		
		//7번 문제
		double var1 = 10;
		double var2 = var1/100;
		if (var2 == 0.1) {		//double의 0.1 입력값과 타입이 다르면 컴파일오류 ex)float일 경우
			System.out.println("10%입니다");			
		} else {
			System.out.println("10%가 아닙니다.");
		}
		//8번 문제
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		double area = (double)(lengthTop + lengthBottom )*height;
//		System.out.println(area);
//		
//		//9번 문제
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("첫 번째 수: ");
//		String str_1 = scanner.nextLine();
//		
//		System.out.println("두 번째 수: " );
//		String str_2 = scanner.nextLine();
//		
//		System.out.println("------------");
//		double num1 = Double.parseDouble(str_1);
//		double num2 = Double.parseDouble(str_2);
//		if (num2 !=0.0) {
//			System.out.println("결과: " + (num1/num2));
//		}
//		else {
//			System.out.printf("결과: 무한대");
//		}
		
		// 문제 10
		int varr1 = 10;
		int varr2 = 3;
		int varr3 = 14;
		String vall = varr2 + "." + varr3;
		double number = Double.parseDouble(vall);
		double varr4 = varr1 *varr1* number;
		System.out.println("원의 넓이: " + varr4);
		
//		문제11
//		Scanner scanner1 = new Scanner(System.in);
//		System.out.println("아이디: ");
//		String name_1 = scanner1.nextLine();
//		
//		System.out.println("패스워드: ");
//		String strPassWord = scanner1.nextLine();
//		int password = Integer.parseInt(strPassWord);
//		
//		if (name_1.equals("java")) {		// name == "java"(x) hashCode, equals함수가 같을 때 '=='이 성립됨
//			if(password == 12345) {
//				System.out.println("로그인 성공");				
//			}
//			else {
//				System.out.println("로그인 실패: 패스워드가 틀림");
//			}	
//		}
//		else {
//			System.out.println("로그인 실패 : 아이디 존재하지 않음");
//		}
//		
		// 문제 12
		int x = 10;
		int y = 5;
		System.out.println((x>7) && (y<=5));
		System.out.println((x%3 == 2)||(y%2 !=1));
		// 두 값이 true면 true / 둘 다 False면 False
		
		// 문제 14
		int score = 85;
		String result = (!(score>90))? "가" : "나";
		System.out.println(result);
		
				

		
		
		
	
		
		
		
		
		
		
	}

}
