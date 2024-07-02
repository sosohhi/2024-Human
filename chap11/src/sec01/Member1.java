package sec01;

public class Member1 {
	
	private String id;
	private String name;
	
	public Member1(String id, String name) {
		this.id = id;
		this.name = name;		
	}
	@Override

	public String toString() {
		return id + ":" +  name;
	}
	
}
