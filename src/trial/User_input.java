package trial;

import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("what is your name");
			Scanner userInput = new Scanner(System.in);	
			String outputname = userInput.nextLine();
			System.out.println(outputname);
		
		
			
			System.out.println("How old are you");
			int outputage = userInput.nextInt();
			System.out.println(outputage);
			
				  
			  System.out.println("Whats your gender?");
			  String outputgender = userInput.next();
			  System.out.println(outputgender);
			
			System.out.println("Where are you from");
			String outputplace= userInput.next();
			System.out.println(outputplace);
			
			System.out.println();
			
			
	}
}
//System.out.println("What is your Name?");
//Scanner userInput = new Scanner(System.in);
//String outputName= userInput.next();
//System.out.println(outputName);

//System.out.println("How old are you?");
//int outputAge= userInput.nextInt();
//System.out.println(outputAge);