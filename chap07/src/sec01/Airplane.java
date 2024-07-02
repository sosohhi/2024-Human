package sec01;

public class Airplane {	//클래스에 final 지정시 상속 할 수 없음
	public void land() {
		System.out.println("착륙합니다.");	
	}
	public void fly() {
		System.out.println("일반비행입니다.");
	}
	public void takeOff() {
		System.out.println("이륙합니다.");
	}

}
