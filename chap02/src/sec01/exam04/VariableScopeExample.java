package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;	// 메소드 블록에서 선언(v1)
		if (v1>10) {	
			int v2;		// if 블록에서 선언(v2)
			v2 = v1 - 10;
		}
//		int v3 = v1 + v2 +5; // v2 변수를 사용할 수 없기 때문에 컴파일 오류 발생(사용범위를 벗어나면 사용 불가능)
		
//		int a1 =3000000000;
		

	}
}
