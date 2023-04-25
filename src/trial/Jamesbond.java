package trial;

import java.util.Scanner;

public class Jamesbond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What is your name?");
		Scanner userInput = new Scanner(System.in);
		String name = userInput.nextLine();
		
		
		System.out.println("How old are your?");
		String age = userInput.nextLine();
		
		System.out.println("Where are you working?");
		String workplace = userInput.nextLine();
		
		
		System.out.println("Where are you living?");
		String livingplace = userInput.nextLine();
		
		System.out.println("Where are you from?");
		String nativeplace = userInput.nextLine();
		
		System.out.println("Whats your salary?");
		String salary = userInput.nextLine();
		
		System.out.println("Are you expecting any salary increase?");
		String increment = userInput.nextLine();
		
		System.out.println("What will be your salary next year?");
		String totalsalary =userInput.nextLine();
		
		System.out.println();
		System.out.println();
		
		System.out.print(name.concat(" "));
		System.out.print(age.concat(" "));
		System.out.print(workplace.concat(" "));
		System.out.print(livingplace.concat(" "));
		System.out.print(nativeplace.concat(" "));
		System.out.print(salary.concat(" "));
		System.out.print(increment.concat(" "));
		System.out.println(totalsalary.concat(" "));

	}

}
