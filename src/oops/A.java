package oops;

import java.util.Scanner;

public class A {
	
	
	
		public static void subs1() {
		
//		System.out.println("subs1 method");
		
			
//			int a =3;
//			int b= 5;
//			
//			a=++b;
//			
//			System.out.println(a);
//			System.out.println(b);
			
			
			System.out.println("give me a number");
			Scanner ui = new Scanner(System.in);
			int num = ui.nextInt();
			
			
			if (num%2 ==0) {
			System.out.println("the number is even");
			
			
			}	
			else {
				
				System.out.println("the number is odd");
			}
	}

}
