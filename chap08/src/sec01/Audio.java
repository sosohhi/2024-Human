package sec01;

public class Audio implements RemoteControl{ 
	//필드
	private int volume;
	
	public void turnOn() {
		System.out.println("Audio를 킵니다.");
	}
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	public void  setVolume(int vol) {	// RemoteControl에 있는 setVolume 메소드
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = vol;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	

}
