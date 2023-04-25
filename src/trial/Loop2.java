package trial;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		System.out.println( "give me a number");
		Scanner ui = new Scanner(System.in);
	
		for (int b=ui.nextInt(); b<=24; b= b+4) {
			
			System.out.println(b);
			
			
			
		}System.out.println( "give me another number");
		
		for (int b=ui.nextInt(); b>=0; b=b-4) {
			System.out.println(b);
			
		}
				
				
	}
}
	

