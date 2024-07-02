package sec01;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");	//바꿔야 하는 문자(왼쪽)를 바꿀 문자(오른쪽)로 변경
		
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
