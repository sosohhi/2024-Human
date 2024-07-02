package sec02;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		
		int i = 1;
		for(; i<=100; i++) {
			sum+=i;
		}
		System.out.println("1~" + (i-1) + "합 : " + sum);
		
		for (int j =0,k=100;j<=50&&k>=50;j++,k--) {
			System.out.println(j +","+ k);
		}
		
		for(;;) {	//무한루프 == while(true)
			break;
		}
		for(int j = 0; ; j++) {	//무한루프 == while(true)
			break;

		}
	}	
}
