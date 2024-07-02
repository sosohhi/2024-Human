package sec01;

public class StringTrimExample {

	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim() ;
		int tell = Integer.parseInt(tel1.trim()) + Integer.parseInt(tel2.trim()) + Integer.parseInt(tel3.trim());
		System.out.println(tel);
		System.out.println(tell);
	}

}
