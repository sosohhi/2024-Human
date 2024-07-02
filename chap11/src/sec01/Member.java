package sec01;

// 내부적으로는 java.lang.Object 클래스가 자동 상속이 됨
public class Member {
	//필드
	public String id;
	
	//생성자
	public Member(String id) {
		//super();가 생략되어있음(Object의 기본 생성자)
		this.id = id;	
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;	//강제형변환
			
			if (id.equals(member.id)) 
				return true;
				
			
		}
		
		return false;
	}
	
	

}
