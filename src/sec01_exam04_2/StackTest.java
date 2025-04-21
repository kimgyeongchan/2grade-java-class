package sec01_exam04_2;

import java.util.Random;

public class StackTest {
	public static void main(String[] args) {
		Random ran = new Random();
		Istack is = new FixedStack(5);
		
		System.out.println("--스택에 데이터 입력하기--");
		for (int i = 0; i < 6; i++) {
			is.push(ran.nextInt(11));
		}
		
		System.out.println("\n\n--스택에서 데이터 출력하기");
		for (int i = 0; i < 6; i++) {
			is.pop();
		}
	}
}
