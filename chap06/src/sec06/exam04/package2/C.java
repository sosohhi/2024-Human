package sec06.exam04.package2;

import sec06.exam04.package1.A;

public class C {
	A a1 = new A(true);
	//A a2 = new A(1); //default 생성자는 같은 패키지만 호출 가능 
	//A a3 = new A("1"); //private 생성자


	a.field1 = 1;
	a.field2 = 1;
	//a.field3 = 1 ; // error 접근제한 private
	
	a.method1();
	a.method2();

	

}
