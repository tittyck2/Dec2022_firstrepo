package oops;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.println("give me a word "); 
		Scanner ui = new Scanner(System.in);
		String ub =ui.next();
		
		char[] xyz = ub.toCharArray();
		
		
		String result="";
		
		for (int i=ub.length()-1 ;i>=0  ;i=i-1) {
			
			System.out.println(xyz[i]);
			
			result = result + xyz[i];
			
			
			}System.out.println(result);
			
		if (ub.equals(result)) {
			
			System.out.println("its a palendrome");
		}
		
			
		
		
		
		
				

	}

}
