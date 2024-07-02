package sec05;

public class Classname {
	// 인스턴스 필드
	int field1;
	//인스턴스 메소드
	void method1() {}
	
	// 정적필드
	static int field2;
	
	//정적메소드
	static void method2() {}
	
	static void method3() {
		// 정적 메소드 안에서는 정적 필드만 사용 가능 , this도 사용 불가능
		
		//this.field1 = 10;		
		//this.method1();	..둘다 오류남
		
		field2 = 10;
		method2();
		
		Classname obj1 = new Classname();
		obj1.field1 = 10;
		obj1.method1();
		//억지로 사용하고 싶다면 호출해서 사용하면 된다.
	}

}
