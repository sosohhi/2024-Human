package sec01;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SupersonicAirplane sa= new SupersonicAirplane();
		
		sa.takeOff();
		
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		
		sa.fly();
		sa.flyMode = SupersonicAirplane.NOLMAL;
		
		sa.fly();
		sa.land();
		

	}

}
