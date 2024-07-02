package practice02;

import java.io.*;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception {
		String filePath = "src/practice02/AddLineNumberExample.java";
		Reader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);
		
		int rowNumber = 1;
		while(true) {
			String data  = br.readLine();
			if (data == null) break;
			System.out.println((rowNumber++) +":" + data);
			
			}
		
		br.close();
		
	}
	
	}


