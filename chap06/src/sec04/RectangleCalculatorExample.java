package sec04;

public class RectangleCalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleCalculator myCalcu = new RectangleCalculator();
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectagle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 : " + result1);
		System.out.println("직사각형 넓이 : " + result2);

	}

}
