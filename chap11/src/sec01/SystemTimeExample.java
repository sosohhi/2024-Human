package sec01;

public class SystemTimeExample {
//프로그램의 실행 소요시간 구하기
	public static void main(String[] args) {
		long time1 = System.nanoTime();//시작시간 읽기
		
		long sum = 0;
		for (long i = 1; i<9999999999L;i++) {
			sum+=i;
		}
		long time2 = System.nanoTime();//끝 시간 읽기
		
//		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("1~9999999999까지의 합" + sum);
		System.out.println("계산에 " + (time2 - time1)+ "나노초가 소요되었습니다.");
		System.out.println("계산에 " + ((time2 - time1)/(double)1000000000)+ "초가 소요되었습니다.");

	}

}
