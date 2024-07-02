package sec01;
import java.io.*;

public class WriteExample {

	public static void main(String[] args) throws Exception{
//		OutputStream os = new FileOutputStream("./bin/sec01/test1.db");	//현재 실행 위치에서 이진 데이터 파일을 만듦.
//		OutputStream os = new FileOutputStream("./bin/sec01/test2.db");
		OutputStream os = new FileOutputStream("./bin/sec01/test3.db");
		
//		byte a = 10;
//		byte b = 20;
//		byte c = 30;
		
		byte[] array = {10,20,30};
		os.write(array);		//베열 전체를 출력
		
//		byte[] array = {10,20,30,40,50};
//		os.write(array)
		
		
//		os.write(a);	//1byte씩 데이터를 버퍼에 출력
//		os.write(b);
//		os.write(c);
		
		os.flush();
		os.close();		//test1.db 파일에 실제 남아있는 버퍼에 모든 바이트를 출력
	}

}
