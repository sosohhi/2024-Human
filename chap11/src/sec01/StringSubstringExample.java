package sec01;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);	//왼쪽은 시작 인덱스 번호, 오른쪽은 가져올 만큼 문자열릐 인덱스 번호
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);	//시작 인덱스 번호부터 끝까지 문자열 가져오기
		System.out.println(secondNum);
		
	}

}
