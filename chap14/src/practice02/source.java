package practice02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class source {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("./bin/sec02/source.txt");
		byte[] array = {10,20,30};
		os.write(array);
		
		os.flush();
		os.close();

	}

}
