package programurs;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int index = 0 ,sum = 0;
    	for (int i = 1; i <= 100; i++) {
    		for (int j = 1; j <= i; j++) {				
    			index++;
    			if(index >= a && index <= b) sum+=i;
    		}
		}
    	System.out.println(sum);
	}
}
