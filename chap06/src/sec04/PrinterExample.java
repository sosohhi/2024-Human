package sec04;

public class PrinterExample {

	public static void main(String[] args) {		//static으로 선언된 곳에서만 사용 가능
		// TODO Auto-generated method stub
		// Printer p1 = new Printer(); >> 객체 생성
	
		Printer.println(10);		//객체 생성 없이 메소드 호출 >> 분리되지 않고 공유용으로 사용하고자 하는 경우 사용
		Printer.println(true);		
		Printer.println(5.7);
		Printer.println("홍길동");

	}

}
