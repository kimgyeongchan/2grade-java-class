package test02;
import java.util.Scanner;

public abstract class Calculator {
	protected double a,b;
	protected abstract double calc();
	protected void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ΰ��� �Է��� �ּ���>>");
		a=sc.nextDouble();
		b=sc.nextDouble();
	}
	public void run() {
		input();
		System.out.println("���� ���� : "+calc());
	}
}
