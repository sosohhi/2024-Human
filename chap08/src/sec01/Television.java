package sec01;

// implements로 세팅된 interface안의 모든 추상 메소드들은 반드시 class에서 구현해야 한다.

public class Television implements RemoteControl {
	
	// 필드
	private int volume;
	
	// turnOn() 추상 메소드의 실제 메소드
	public void turnOn() {	// RemoteControl에 있는 turnOn 메소드
		System.out.println("TV를 킵니다.");
		
		
	}
	public void turnOff() {	// RemoteControl에 있는 turnOff 메소드
		System.out.println("TV를 끕니다.");
		
	}
	public void setVolume(int vol) {	// RemoteControl에 있는 setVolume 메소드
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = vol;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	

}
