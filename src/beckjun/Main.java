package beckjun;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[9];
		int sum = 0,a= 0,b = 0;
		for (int i = 0; i < 9; i++) {
			intArr[i] = sc.nextInt();
			sum += intArr[i];
		}

		Arrays.sort(intArr);

		for (int i = 0; i < intArr.length-1; i++) {
			for (int j = i+1; j < intArr.length; j++) {
				if(sum - intArr[i] - intArr[j] == 100) {
					a=i;
					b=j;
					break;
				}
			}
		}

		for (int i = 0; i < intArr.length; i++) {
			if(i != a && i != b) {
				System.out.println(intArr[i]);
			}
		}
	}
}
