package sec03.exam05;

public class OperationsPromotionExample {
// 실수에서의 자동타입 변환 관련 예제
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; //컴파일에러
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		charValue3 = charValue1 + charValue2; //컴파일에러
		
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드="+intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = 10/4.0; // 컴파일에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x =1;
		int y = 2;
		double result = (double) x / y; // x -> 캐스팅(casting). 그래서 y도 double 타입으로 자동변환됨. 1.0 /2 -> 1.0/2.0 ->0.5
		System.out.println(result);
		//---------------------------------------------------------------------------

		//---------------------------------------------------------------------------
		// + 연산에서의 문자열 자동 타입 변환 예제
		// 숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value: "+ value);
		
		// 결합연산
		String str1 = 10 + 2 + "8";			// (10+2) -> 12 ->"12" + "8" ->128
		System.out.println("str1: "+ str1);
		
		String str2 = 10 + "2" + 8;			// "10" + "2" + "8" ->1028
		System.out.println("str2: "+ str2);
		
		String str3 = "10"+ 2 + 8;			// "10" + "2" + "8" ->1028
		System.out.println("str3: "+ str3);
		
		String str4 = "10" + (2+8);			//(2+8) ->10 ->"10" ->1010
		System.out.println("str4: "+ str4);
		
		
		// 문자열을 기본 타입으로 강제 타입 변환 예제
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");	// true <->"true"
		
		System.out.println("value1: "+ value1);
		System.out.println("value2: "+ value2);
		System.out.println("value2: "+ value3);
	
		
		String str12 = String.valueOf(10);
		String str13 = String.valueOf(3.14);
		String str14 = String.valueOf(true);
		
		System.out.println("str12: "+ str12);
		System.out.println("str13: "+ str13);
		System.out.println("str14: "+ str14);
		
		long varr1 = 2l;
		float varr2 = 1.8f;
		double varr3 = 2.5;
		String varr4 = "3.9";
		int result34 = (int)(varr1 + varr2 + varr3 + (int)Double.parseDouble(varr4));
		System.out.println(result34);
		
		
		
				

	}

}
