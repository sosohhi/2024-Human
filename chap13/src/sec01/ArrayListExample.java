package sec01;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		//String으로 된 여러 개의 객체를 Array처럼 사용하도록 ArrayList 객체를 생성
		List<String> list = new ArrayList<>();	//뒤에 ArrayList <>안에 클래스 이름은 생략이 가능 
		
		//리스트 원소 추가
		list.add("Java");			//"JAVA"값을 String 객체를 0번째 인덱스에 추가 및 저장
		list.add("JDBC");			//"JDBC"값을 String 객체를 1번째 인덱스에 추가 및 저장
		list.add("Servlet/JSP");	//"Servlet/JSP"값을 String 객체를 2번째 인덱스에 추가 및 저장
		list.add(2, "Database"); 	//2번째 인덱스에 Database 값을 가진 String 객체를 저장
		list.add("iBATIS");			//4번째 인덱스에 iBATIS 값을 가진 String 객체를 저장
		
		int size = list.size();		// 5 : 저장된 총 객체의 수
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
		//리스트 원소 검색
		String skill = list.get(2);	// 2번 인덱스의 개체 얻기
		System.out.println("2: " + skill);	//2: Database
		System.out.println();
		
		//리스트의 개수만큼 순회하여 값을 찍음
		for (int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2);	//인덱스 2번의 값을 삭제->Database 삭제
		list.remove(2);	//인덱스 2번의 값을 삭제->Servlet/JSP 삭제
		//list -> 0: Java, 1:JDBS, 2:iBATISs
		list.remove("iBATIS");
		
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();

		// 리스트 원소 수정
		list.set(0,"Python");
		
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		list.clear();

	}
		

}
