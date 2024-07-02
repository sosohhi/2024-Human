package sec03;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week week1 = Week.SATURDAY;
		Week week2 = Week.SATURDAY;
		System.out.println(week1 == week2);
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR); // final int 변수 ->연도
		System.out.println("현재 연도: " + year);
		int month = now.get(Calendar.MONTH)+1; // java에서는 1월일 때 0값을 돌려줌
		System.out.println("현재 월: " + month);
		int day = now.get(Calendar.DAY_OF_MONTH); //일
		System.out.println("현재 일: " + day);
		int week = now.get(Calendar.DAY_OF_WEEK); //요일(1~7) :일요일 ->1, 월요일->2...
		System.out.println("현재 요일: "+week);
		int hour = now.get(Calendar.HOUR);			//시
		int minut  = now.get(Calendar.MINUTE);		//분
		int second = now.get(Calendar.SECOND);		//초
		System.out.println("현재 시간 : "+ hour +"시"  + minut+"분" + second + "초");
		
		

	}

}
