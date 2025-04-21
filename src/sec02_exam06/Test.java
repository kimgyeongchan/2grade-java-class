package sec02_exam06;

public class Test {
	public static void main(String[] args) {
		HPPriter hp = new HPPriter(); //HP 프린터 객체 생성
		USBMemory us = new USBMemory(); // USB메모리 객체 생성
		
		Device dv = hp; //자바의 클래스 타입변환
		dv.print();
		dv = us;//자바의 클래스 타입변환
		dv.print();
		
		Connectable co = hp; //자바의 클래스 타입변환
		co.connect();
		co = us; //자바의 클래스 타입변환
		co.connect();
	}
}
