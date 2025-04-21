package istacktest;

import java.util.Random;

public class StackTest {
	public static void main(String[] args) {
		Random rand = new Random();
		Istack is = new FixedStack(5);
		for (int i = 0; i < 6; i++) {
			is.push(rand.nextInt(11));
		}
		
		for (int i = 0; i < 6; i++) {
			is.pop();
		}
		
		
	}
}
