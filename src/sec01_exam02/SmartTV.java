package sec01_exam02;
public class SmartTV implements Remocon,Search{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("SmartTv�� �մϴ�.");
	}
	@Override
	public void turnOff() {
		System.out.println("SmartTV�� ���ϴ�.");
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
		System.out.println("���� SmartTV�� ���� :"+volume);
	}
	@Override
	public void urlSearch(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}
}
