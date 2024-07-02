package sec01;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap객체를 생성
		HashMap<Key, String> hashMap1 = new HashMap<Key, String>();
		HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
		HashMap<String, String> hashMap3 = new HashMap<String, String>();
		
		Key a1 = new Key(1);
		Key a2 = new Key(1);
		
		//식별키 key1을 "홍길동으로 저장"
		hashMap1.put(a1, "홍길동");
		hashMap2.put(1, "홍길동");
		hashMap3.put("1", "홍길동");
		
		String value = hashMap1.get(a1);
		System.out.println(value);	//number값을 가져오도록 hashcode메소드를 재정의 하였다면 홍길동을 가져온다.

	}

}
