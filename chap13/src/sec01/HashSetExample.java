package sec01;
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");		//set클래스 객체는 중복값 허용x -> 한번만 저장됨
		set.add("iBATIS");			
		
		int size = set.size();		//저장된 객체수 얻기
		System.out.println("총 객체 수: " + size);
		
		Iterator<String> iterator = set.iterator();	//반복자 얻기	
		while(iterator.hasNext()) {					//객체의 수만큼 반복
			String element = iterator.next();		//1개의 객체를 가져옴
			System.out.println("\t" + element );
		}
		
		set.remove("JDBC");		//1개의 객체 삭제
		set.remove("iBATIS");
		
		System.out.println("총 객체 수: " + set.size());		//저장된 객체 수 얻기
		
		iterator = set.iterator();		//반복자 얻기
		for (String element : set) {			//객체 수만큼 반복
			System.out.println("\t" + element);
		}
		
		set.clear();			//모든 객체를 제거하고 비움
		if (set.isEmpty()) {System.out.println("비어 있음");}
	}

}
