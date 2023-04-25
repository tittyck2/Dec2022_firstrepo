package homeWork;

import java.util.Scanner;

public class Class5c {

	public static void main(String[] args)
	{
		System.out.println("Give me a number.");
		Scanner ui = new Scanner(System.in);
		int i = ui.nextInt();
		
		System.out.println("Give me another number.");
		int j = ui.nextInt();
		
		System.out.println("Which arithmatic operation do you want?");
		Scanner us = new Scanner(System.in);
		String x = us.next();
		
		
		if (x.equalsIgnoreCase("add")) {
			
			System.out.println(i+j);
		}
		
		
		if (x.equalsIgnoreCase("sub")) {
			
			
			Class5.sub(i, j);
		}
		if (x.equalsIgnoreCase("multi")) {
			
			Class5a m= new Class5a();
			
					m.multiple(i, j);
			
			}
		
		if (x.equalsIgnoreCase("div")) {
			
			
			Class5b d= new Class5b();
			d.divide(i, j);
			
		
		}
		
	}
	
		
		
		
		
	}
	



