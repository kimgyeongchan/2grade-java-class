package sec01_exam02;
public class SmartTV implements Remocon,Search{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("SmartTv를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("SmartTV를 끕니다.");
	}
	@Override
	public void setVolume(int vol) {
		if(vol > Remocon.MAX_VOLUME) {
			volume = Remocon.MAX_VOLUME;
		}else if(vol < Remocon.MIN_VOLUME) {
			volume = Remocon.MIN_VOLUME;
		}else {
			volume = vol;
		}
		System.out.println("현재 SmartTV의 볼륨 :"+volume);
	}
	@Override
	public void urlSearch(String url) {
		System.out.println(url+"을 검색합니다.");
	}
}
