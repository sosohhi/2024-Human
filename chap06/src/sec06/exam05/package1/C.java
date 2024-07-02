package sec06.exam05.package1;

public class C {
	public C (){

	A a = new A();
	a.field1 = 1;
	a.field2 = 1;
	//a.field3 = 1 ; // error 접근제한 private
	
	a.method1();
	a.method2();
	a.method3();
  }


}
