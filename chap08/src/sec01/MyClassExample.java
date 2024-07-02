package sec01;

public class MyClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1)---------------");
		// 1)Tv를 킨다.
		
		MyClass myclass = new MyClass();
		myclass.rc.turnOn();
		myclass.rc.setVolume(5);
		
		System.out.println("2)---------------");
		// 2) Audio1를 킨다.
		
		MyClass myclass2 = new MyClass(new Audio());
		
		System.out.println("3)---------------");
		// 3) Audio2를 킨다.
		
		MyClass myclass3 = new MyClass();
		myclass3.methodA();
		
		System.out.println("3)---------------");
		// 4) Tv2 를 킨다. 
		
		MyClass myclass4 = new MyClass();
		myclass4.methodB(new Television());

	}

}
