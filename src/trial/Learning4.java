package trial;

import java.util.Scanner;

public class Learning4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Whats your name?");
			
			
			Scanner userInput = new Scanner(System.in);
			String output = userInput.nextLine();	
			
			System.out.println(output);
	
			System.out.println("How old are you?");
			String output1 = userInput.nextLine();
			
			System.out.println(output1);
			
			System.out.println("Where are you from?");
			String output2 = userInput.next();
			
			System.out.println(output2); 
			
			System.out.println("What do you do?");
			String output3 = userInput.next();
					
			System.out.println(output3);
			
			
			System.out.println("what is your gender");
			String output4 = userInput.next();
			
			System.out.println(output4);
			
			System.out.println("where do you live now");
			String output5 = userInput.next();
			
			System.out.println(output5);
			
			System.out.println("what is your salary");
			int output6 = userInput.nextInt();
					
			System.out.println(output6);
			
			
			
			
			
			}
}
