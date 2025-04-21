package test02;
import java.util.Scanner;

public abstract class Calculator {
	protected double a,b;
	protected abstract double calc();
	protected void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 두개를 입력해 주세요>>");
		a=sc.nextDouble();
		b=sc.nextDouble();
	}
	public void run() {
		input();
		System.out.println("계산된 값은 : "+calc());
	}
}
