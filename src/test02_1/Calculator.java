package test02_1;

import java.util.Scanner;

public abstract class Calculator {
	protected int a,b;
	protected abstract int calc(int a,int b);
	protected void input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� 2���� �Է��ϼ���>>");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public void run() {
		input();
		System.out.println("���� ����: "+calc(a,b));
	}
}
