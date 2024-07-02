package sec02;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제2
		int sum = 0;
		for (int i=1;i<=100;i++) {
			for (;i % 3 == 0;i++) {
				sum+=i;			
			}
		}System.out.println("3의 배수의 총합: " + sum);
		
		int sum1 = 0;
		for (int i=1;i<=100;i++) {
			if (i % 3 ==0) {
				sum1+=i;
			}
		}System.out.println("3의 배수의 총합: "+ sum1);
		
//		문제3
		
		
		while (true) {
			int dice1 = (int)(Math.random()*5) + 1;
			int dice2 = (int)(Math.random()*5) + 1;
			System.out.println("("+dice1 + ',' + dice2+")");
			if ((dice1+dice2) ==5) {
				break;
			}
		}
		
//		문제4
			
		for (int x=1;x<=10;x++) {
			for (int y=1;y<=10;y++) {
				if ((int)(x*4)+(y*5)==60) {
					System.out.println("문제4 ("+ x + ","+y+")");
				}
				
			}
		}
		
//		문제5
		
		for(int i=1;i<5;i++) {
			for (int j=1; j<=i;j++) {
				System.out.print("*");
				if (j==i) {
					System.out.println();
				}
			}
		}
		
//		문제6
		for (int ii = 1; ii < 5; ii++) {
			for (int jj = 4; jj>0;jj--) {
				if (ii<jj) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
//		문제7
		boolean run = true;
		int balance =0;
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------------");
			System.out.println("선택> ");
			
			int menu = Integer.parseInt(scanner.nextLine());
			
			
			switch (menu) {
			
			case 1:				
				System.out.println("예금액> ");
				balance = balance + Integer.parseInt(scanner.nextLine());
				break;
				
			case 2:
				System.out.println("출금액> ");
				balance = balance - Integer.parseInt(scanner.nextLine());
				break;
			
			case 3:	
				System.out.println("잔고> " + balance);
				break;
			
			case 4:
				run = false;
				break;
					
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
		

}


