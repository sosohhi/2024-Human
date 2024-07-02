package sec01;

public interface RemoteControl {
	//상수(필드)
	final int MAX_VOLUME = 10;	// public final static 상수
	final int MIN_VOLUME = 0;	// public final static 상수
	
	// 생성자는 없음
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
