package sec02_exam06;

public class Test {
	public static void main(String[] args) {
		HPPriter hp = new HPPriter(); //HP ������ ��ü ����
		USBMemory us = new USBMemory(); // USB�޸� ��ü ����
		
		Device dv = hp; //�ڹ��� Ŭ���� Ÿ�Ժ�ȯ
		dv.print();
		dv = us;//�ڹ��� Ŭ���� Ÿ�Ժ�ȯ
		dv.print();
		
		Connectable co = hp; //�ڹ��� Ŭ���� Ÿ�Ժ�ȯ
		co.connect();
		co = us; //�ڹ��� Ŭ���� Ÿ�Ժ�ȯ
		co.connect();
	}
}
