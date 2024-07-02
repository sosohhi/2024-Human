package sec02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);		//자식 메서드 사용  >> 재정의 한 것이 출력
		driver.drive(taxi);

	}

}
