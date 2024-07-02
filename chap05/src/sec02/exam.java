package sec02;
import java.util.Scanner;
public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제 4 
		int max = 0;
		int[] array = {1,5,3,8,2};
		for (int i=0;i<array.length;i++) {
			if (max <array[i]) {
				max = array[i];
			}
			
			
		}
		System.out.println("max: " + max);
		
//		문제 5 
		int[][] array1 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}	
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int i=0 ; i<array1.length;i++) {
			int temp1 = array[i],length;
			for (int j = 0; j<temp1;j++){
				sum = sum + array1[i][j];
			}
			count += temp1;
		}
		System.out.println("sum: " + sum);
		
		avg = (double)sum/count;
		System.out.println("avg: " + avg);
		
//		문제6
		
		
				
	}

}
