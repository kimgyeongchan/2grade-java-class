package test02_1;

import java.util.Scanner;

public abstract class Calculator {
	protected int a,b;
	protected abstract int calc(int a,int b);
	protected void input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수 2개를 입력하세요>>");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public void run() {
		input();
		System.out.println("계산된 값은: "+calc(a,b));
	}
}
