package sec05;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person pi = new Person("123456-1234567","홍길동");
		
		System.out.println(pi.nation);
		System.out.println(pi.ssn);

		System.out.println(pi.name);
		
//		pi.nation = "미국"; >> 에러 (final 이 정해져 있는 경우)
		pi.name = "유관순";
		System.out.println(pi.name); //  final선언 안하면 변경 가능

		

	}

}
