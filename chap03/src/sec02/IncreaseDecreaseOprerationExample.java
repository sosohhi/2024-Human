package sec02;

public class IncreaseDecreaseOprerationExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++;		//11  >> 먼저 x대입 후 +1
		++x;		//12  >> 먼저 1더한 후 x대입 
		System.out.println("x = " + x);	
		
		System.out.println("------------------");
		y--;		//9   >> 먼저 y대입 후 -1
		--y;		//8	  >> 먼저 -1 후 y대입
		System.out.println("y = " + y);
		
		System.out.println("------------------");
		z = x++;		// (1) z = x (2) x = x+1
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("------------------");
		z = ++x;		// (1) x = x+1 (2) z = x
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		
		System.out.println("------------------");
		z = ++x + y++;	// (1)x = x + 1 (2) z = x+y (3)y=y+1
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

		
		

		
		
		
		
		
		
		
		

	}

}
