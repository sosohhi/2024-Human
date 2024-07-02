package sec02;
import java.io.*;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		// buffered를 사용하지 않고 copy
		// copy할 파일의 path 가져오기
		String originalFilePath1
		=NonBufferVsBufferExample.class.getResource("dog1.jpg").getPath();
		System.out.println("originalFilePath1 -> " + originalFilePath1);
		
		
		// 복사 대상의 파일의 path세팅 
		String targetFilePath = "./bin/sec02/dog1-copy.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath);
		
		long nonBufferElaspTime =copy(fis,fos); // 기본 스트림을 사용하여 copy한 시간을  측정
		System.out.println("버퍼를 사용하지 않았을 때:\t "  + nonBufferElaspTime + "ns" );
		
		String originalFilePath2
		=NonBufferVsBufferExample.class.getResource("dog2.jpg").getPath();
		System.out.println("originalFilePath2 -> " + originalFilePath2);
		
		String targetFilePath2 = "./bin/sec02/dog2-copy.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		// 보조 스트림 추가
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long BufferElaspTime =copy(bis,bos); // 기본 스트림을 사용하여 copy한 시간을  측정
		System.out.println("버퍼를 사용했을 때:\t "  + BufferElaspTime + "ns" );
		
		
		
	
		
	}
	/**
	 * desc : 복사 함수
	 * @param is
	 * @param out
	 * @return 걸린 시간
	 * @throws Exception
	 */
	
	public static long copy (InputStream is, OutputStream out) throws Exception {
		int data = -1;
		
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if (data == -1) break;
			out.write(data);
		}
		out.flush();
		
		return System.nanoTime() - start;
	
	}
}
