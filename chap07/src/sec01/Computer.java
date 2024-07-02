package sec01;

public class Computer extends Calculator{
	@Override		// 부모클래스의 메소드를 재정의 하겠다고 선언(가이드역할)
	double areaCircle(double r) {
		System.out.println(
				"Computer 객체의 areaCircle() 실행");
		return Math.PI *r *r;
	}

}
