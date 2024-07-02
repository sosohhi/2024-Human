package sec04;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // 선언된 Scanner변수 값에 시스템의 입력 장치로부터 읽는 Scanner 생성하여 저장
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine();		//String 변수 값에 enter키 이전까지 입력된 문자열을 읽어서 변수에 저장
			System.out.println("입력된 문자열 \"" + inputData + "\"");
			if(inputData.equals("q")) {		// inputData(저장된 문자열) 과 equals안의 비교문자열을 비교 >>같으면 True 다른면 False
				break;
			}
		}
		System.out.println("종료");

	}

}
