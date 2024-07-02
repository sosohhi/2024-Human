package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동타입변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue= '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " +intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: "+longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: "+floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: "+doubleValue);
		
		// --------------------------------------------------------------
		// 정수 연산에서의 자동타입 변환(byte 예제)
		byte result1 =10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x+ y;
		System.out.println(result2);
		// --------------------------------------------------------------
		// --------------------------------------------------------------
		// 정수 연산에서의 자동타입 변환(long 예제)
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);
		// --------------------------------------------------------------
		

	}

}
