package sec02;
import java.io.*;
public class bojoStreamExample1 {

	public static void main(String[] args) throws Exception {
		//보조 스트림 연결하는 방법(문자 기반의 입력 예제)
		InputStream is =System.in;
		InputStreamReader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		//Scanner sc = new Scanner(System.in)과 동일 기능을 하나 성능이 더 좋음
		System.out.println("아무거나 입력하세요 -> ");
		
		//버퍼에 있는 데이터 한 줄을 읽는 코드
		String readLine1 = br.readLine();
		
		System.out.println("프로그램 종료");
		
	}

}
