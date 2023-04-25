package oops;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		System.out.println("give me a number");
		Scanner ui = new Scanner(System.in);
		int num = ui.nextInt();
		
		int result = 0;
		for (int i=num;i>0 ;i--) {
			System.out.println(i);
			
			result = result + i;
			System.out.println(result);
		}
		
	}

}
