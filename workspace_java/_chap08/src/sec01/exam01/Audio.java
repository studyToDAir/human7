package sec01.exam01;

public class Audio implements RemoteControl{
	int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 끕니다");
		
	}

	void test() {
		
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			
			volume = RemoteControl.MAX_VOLUME;
			
		} else if(volume < RemoteControl.MIN_VOLUME) {
			
			volume = RemoteControl.MIN_VOLUME;
			
		}
		
		this.volume = volume;
		
		System.out.println("오디오 현재 볼륨 : "+ this.volume);
	}

}
