package trial;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		
//		int a =61;
//		int b =62;
//		int c =63;
//		
//		if(a<b)
//		{
//			System.out.println("b is big");
//		}
//		else	
//		{
//			System.out.println("a is big");
//		}
//		if (b>c)
//		{System.out.println("b is bigger than c");
//		
//		}
//		else
//		{System.out.println("b is smaller than c");
//		
//		}
//		
//		if(!(a==b))
//			{System.out.println("a and b are not equal");
//			
//			}
//		
//		if(a==b)
//			{System.out.println("a is equal to b");
//			
//			}
//			
//		else
//			{System.out.println("a is not equal to b");
//			}
		

//		
//		String x = "What is the temperature?";
//		Scanner ui = new Scanner(System.in);
//		System.out.println(x);
//		int s=ui.nextInt();
//		
//		
//				
//		if(s>50){
//			
//			if (s>60) {
//				System.out.println("Keep AC to maximum");
//				
//				
//			}
//			else System.out.println("Keep AC at minimum");
//			
//			
//		}
//		
//		else {
//			System.out.println("No need of AC");
//		}
		
		
		String y = "What type of apples available?";
		Scanner ui = new Scanner (System.in);
		System.out.println(y);
		String colors = ui.next();
		
		if (colors.equalsIgnoreCase("red")) 
		
			{
			System.out.println("Is the apples small?");
			Scanner ux= new Scanner (System.in);
			String sizes =ux.nextLine();
			
			if(sizes.equalsIgnoreCase("yes")) { 
			
				System.out.println("buy 5 small red apples.");
			}
		
			else {		
			
			System.out.println("Buy 2 big red apples.");
			
			}
			
		}
		
			
		else {
			System.out.println("dont buy any apple");
		}
		
	}
}
		
		
		
		
//		String v="Was that a Goal" ;
	//	Scanner ui = new Scanner(System.in);
	//	System.out.println(v);
		//String u = 	ui.nextLine();
		
		
	//	if (u.startsWith("y") || u.contains("e")) {
			
		//	System.out.println("it was a beautiful goal");}
			
//			if (!u.contains("e")) {
//				
//			System.out.println("beautiful shot");}	
//			
//			
//			if (u.endsWith("s")) {
//			
//			System.out.println("super finish");
//			}
		
//			else {
	//System.out.println("Golden opportunity missed");
			
			
		
	
		
			
	
		
		
		
	

	

	


