package sec01_exam04;

import java.util.Random;

public class StackTest {
	public static void main(String[] args) {
		Random ran = new Random();
		Istack is = new FixedStack(5);
		
		System.out.println("--���� ������ �Է��ϱ�--");
		for (int i = 0; i < 6; i++) {
			is.push(ran.nextInt(11));
		}
		
		System.out.println("\n\n--���ÿ��� ������ ����ϱ�--");
		for (int i = 0; i < 6; i++) {
			is.pop();
		}
	}
}
