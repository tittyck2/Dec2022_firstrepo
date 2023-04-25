package oops;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5+4+3+2+1
		System.out.println("give me a number");
		Scanner ui = new Scanner(System.in);
		int m = ui.nextInt();
		int result = 0;
		
		
		for (int i = m;i>0;i=i-1) {
			
			
			result = result + i;	
		
			
		}
		System.out.println(result);
	}

}
