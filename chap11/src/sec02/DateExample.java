package sec02;

import java.util.*;
import java.text.*;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy년 dd일 hh시 mm분");
		String strNow2 =sdf.format(now);
		System.out.println(strNow2);
		
		SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy-mm-dd HH:MM:ss a");
		String strNow3 = sdf2.format(now);
		System.out.println(strNow3);
		
		SimpleDateFormat daate = new SimpleDateFormat("yyyy년 mm월 dd일 E요일 hh시 mm분 ");
		
		System.out.println(daate.format(now));
		
		Calendar now2 = Calendar.getInstance()
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek=null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
			}

		
	}

}
