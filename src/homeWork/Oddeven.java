package homeWork;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		
		
		System.out.println("give me a number");
		Scanner ui=new Scanner(System.in);
		int n = ui.nextInt();
		
		if (n % 2 ==0) {
			
			System.out.println("the given number is even");
			
			
		}else {
			
			System.out.println("the given number is odd");		}
	}

}
