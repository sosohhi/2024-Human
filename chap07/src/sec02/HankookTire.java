package sec02;

public class HankookTire extends Tire {
	//1개의 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Hankook Tire수명: " +
		(maxRotation-accumulatedRotation)+"회");
			return true;
		}
		else {
			System.out.println("***" +location + "Hankook Tire 펑크 ***");
			return false;
		}
	}
	

}
