package sec02_exam06;

public class USBMemory extends Device implements Connectable{
	@Override
	public void print() {
		System.out.println("�Ｚ USB �޸��Դϴ�.");
	}
	@Override
	public void connect() {
		System.out.println("������ : USB �Ｚ USB�޸𸮸� �����մϴ�.");
	}
}
