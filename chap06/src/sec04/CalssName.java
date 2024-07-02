package sec04;

public class CalssName {
	int method1(int x, int y) {
		int result = x + y;
		return result;
	}
	
	int method2() {
		int result = method1(10,20);	//내부메소드 호출
		double result2 = method1(10,20);	//내부메소드
		return result;
	}


}
