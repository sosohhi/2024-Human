package sec01;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		// 재정의한 equals함수로 obj1과 obj2는 같음("blue" == "blue")
		if (obj1.equals(obj2)) {
			System.out.println("obj1 과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1 과 obj2는 동등하지 않습니다.");
		}
		
		// 두 객체가 같다는 의미는 아래와 같다 
		//-> == 
		//->즉, hashCode의 리턴 숫자값이 같고 equals메소드에서 리턴값이 true인 경우 
		
		// 재정의한 equals함수로 obj1과 obj3는 다름("blue" != "red")
		if (obj1.equals(obj3)) {
			System.out.println("obj1 과 obj3는 동등합니다.");
		}else {
			System.out.println("obj1 과 obj3는 동등하지 않습니다.");
		}

	}

}
