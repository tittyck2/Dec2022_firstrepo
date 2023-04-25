package homeWork;

import java.util.Scanner;

public class Pdrome {

	public static void main(String[] args) {
		
//		System.out.println("give me a word.");
//		Scanner ui=new Scanner(System.in);
//		String w = ui.nextLine();
//		
//		String result ="";
//		char[] arr = w.toCharArray();
//		
//		for (int i=arr.length-1;i>=0;i=i-1) {
//			
//			System.out.println(arr[i]);
//			
//			result=result+arr[i];
//			
//		}
//		
//		System.out.println(result);
//	
//	
//	if (w.equals(result)) {
//		System.out.println("palendrome");
//	}
		
		
		
//		
//		System.out.println("Give me a word");
//		Scanner ui = new Scanner(System.in);
//		
//		String word = ui.nextLine();
//		
//		String result ="";
//		
//		char[] w = word.toCharArray();
//		
//		for (int i=w.length-1; i>=0; i--) {
//			
//			System.out.println(w[i]);
//			
//			result = result+ w[i];			
//		}System.out.println(result);
		
		
		
//		
//		System.out.println("Give me a number");
//		Scanner ui = new Scanner(System.in);
//		
//		int num = ui.nextInt();
//		
//		int result =0;
//		
//		
//		
//		for (int i = num; i>0; i--) {
//			
//			System.out.println(i);
//			
//			result = result+ i;			
//		}
//		
//		System.out.println(result);
		
		
		
		
		
		
		
		System.out.println("give me a word");
		Scanner ui = new Scanner(System.in);
		
		String word = ui.nextLine();
		
		char [] w = word.toCharArray();
		
		String result = "";
		
		for (int i = w.length-1; i>=0;i--) {
			
			System.out.println(w[i]);
			
		result = result + w[i];
		}
			
			System.out.println(result);
		
		
		if (word.equals(result)) {
			
		System.out.println("palendrome");
		
		}
		}
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

