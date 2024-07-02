package sec01;

public class SupersonicAirplane extends Airplane {
	
	public static final int NOLMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode =NOLMAL;
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			super.fly();
		}
	}

}
