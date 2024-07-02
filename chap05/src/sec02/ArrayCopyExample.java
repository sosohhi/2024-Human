package sec02;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//첫번째 방법 => for 문 활용
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];		// {0,0,0,0,0}
		
		//원소복사
		for (int i = 0; i<oldIntArray.length;i++) {
			newIntArray[i] = oldIntArray[i];
		}
		//확인출력
		for (int i = 0; i<newIntArray.length;i++) {
			System.out.print(newIntArray[i]+",");
		}
		
		System.out.println(" ");
		System.out.println("-------------------\n");
		

		
		//두번째 방법 => System.arraycopy(Object src, int, srcPos, Object desc, int destPost, int length) 메소드 활용
		String[] oldStrArray = {"java", "array","copy"};
		String[] newStrArray = new String[5];
		
		// 원소복사
		System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);
		
		//확인출력
		for (int i = 0; i< newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
