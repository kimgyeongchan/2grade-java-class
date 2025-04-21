package istacktest;

import java.util.Random;

public class StackTest2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Istack2 is = new FixedStack2(5);
		
		for (int i = 0; i < 6; i++) {
			is.push(ran.nextInt(11));
		}
		
		for (int i = 0; i < 6; i++) {
			is.pop();
		}
		
	}
}
