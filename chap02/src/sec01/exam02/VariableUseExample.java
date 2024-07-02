package sec01.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour =3;
		int minute=5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour *60) + minute;
		System.out.println("총" + totalMinute + "분"); // 파이썬은 문자형이 다르면 변환함수가 필요하나 자바는 자동으로 변환해준다.
	}

}
