package sec05;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result1 = 10*10*Calculator.Pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);

		System.out.println("result3 : " + result3);
		
		
		// static 로 된 멤버들은 객체에서 호출하는 것을 지양한다. 
		
		Calculator cal1 = new Calculator();
		double result11 = 10*10*cal1.Pi;
		int result22 = cal1.plus(10, 5);
		int result33 = cal1.minus(10, 5);
		System.out.println("result11 : " + result11);
		System.out.println("result22 : " + result22);

		System.out.println("result33 : " + result33);

		

	}

}
