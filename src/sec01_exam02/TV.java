package sec01_exam02;
public class TV implements Remocon{
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}
	@Override
	public void setVolume(int vol) {
		if(MAX_VOLUME <=vol) {
			this.volume=MAX_VOLUME;
		}else if(MIN_VOLUME>=vol) {
			this.volume=MIN_VOLUME;
		}else {
			this.volume=vol;
		}
		System.out.println("ÇöÀç TVÀÇ º¼·ý:"+volume);
	}

}
