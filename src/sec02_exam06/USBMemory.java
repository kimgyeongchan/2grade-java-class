package sec02_exam06;

public class USBMemory extends Device implements Connectable{
	@Override
	public void print() {
		System.out.println("삼성 USB 메모리입니다.");
	}
	@Override
	public void connect() {
		System.out.println("연결방법 : USB 삼성 USB메모리를 연결합니다.");
	}
}
