package sec01;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		
		//비교
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		//두 문자의 대소문자를 맞추고 비교
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 =str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		//두 문자열이 대소문자가 다를 경우 맞추기 않고 비교하는 방법
		System.out.println(str1.equalsIgnoreCase(str2));
		

	}

}
