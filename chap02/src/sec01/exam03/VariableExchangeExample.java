package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);
		
		int temp = x;	// x와 y를 교환하는 방법
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);

	}

}
