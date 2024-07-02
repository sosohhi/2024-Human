package sec04;

public class MemberService {
	
	boolean login(String id, String password) {		// 인스턴스 멤버
		if (id.equals("hong") && password.equals("12345")) {
			return true;			
		}
		else {
			return false;	
		}	
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
