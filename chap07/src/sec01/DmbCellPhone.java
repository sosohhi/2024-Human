package sec01;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	public DmbCellPhone() {
		super();			//CellPhone의 기본 생성자 호출
	}
	
	public DmbCellPhone(
			String model, 
			String color, 
			int channel) {
		// this 모델은 CellPhone에 있는 모델
		// 위의 모델은 매개변수 모델
		// super(); //해당 코드가 없어도 자동으로 만들어짐
		this.model = model; 
		this.color = color;
		this.channel = channel;		
	}

	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");		
	}
	void ChageChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");	
	}
}
