package sec01;
import java.io.*;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
//		Reader reader =new FileReader("./bin/sec01/test1.txt");
//		Reader reader =new FileReader("./bin/sec01/test2.txt");
		Reader reader =new FileReader("./bin/sec01/test3.txt");


		
//		while (true) {
//			int data = reader.read();
//			if (data == -1) break;
//			System.out.println("1char data ->" + (char)data);
//		}
		/*
		int data =  reader.read(); //test.txt안의 1char 읽어 리턴, 만약에 못읽으면 -1을 리턴
		System.out.println("1char data -> " + (char)data);
		data =  reader.read(); //test.txt안의 1char 읽어 리턴, 만약에 못읽으면 -1을 리턴
		System.out.println("1char data -> " + (char)data);
		data =  reader.read(); //test.txt안의 1char 읽어 리턴, 만약에 못읽으면 -1을 리턴
		System.out.println("1char data -> " + (char)data);
		*/
		
//		char[] buffer = new char[100];
//		while (true) {
//			int readCharNum = reader.read(buffer);		//test1.txt안의 1char 읽어오기
//			if (readCharNum==-1) break;
//			for (int i=0;i<readCharNum; i++) {
//				System.out.println(buffer[i]);
//			}
//		}
	
		char[] buffer = new char[5];
		
			int readCharNum = reader.read(buffer,2,3);
			if (readCharNum == -1) break;
			for (int i = 0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}

	
	}


