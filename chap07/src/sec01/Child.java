package sec01;

public class Child extends Parent {
	void method3() {
		System.out.println("Child의 메서드3");
		
	}
	void method2() {
		System.out.println("Child의 메서드2");
		super.method2(); // 부모클래스메서드 호출 super() >생성자 호출
		
	}

}
