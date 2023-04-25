package trial;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String[] names = {"saira","reuben","shweta"};
//		
////		System.out.println(names[2]);
//		
//		String[] names1 =new String[8];
//		
//		names1[0] ="saira";
//		names1[1] ="reuben";
//		names1[2] ="shweta";
//		
//		System.out.println(names1[5]);
		
		int[] ages = {51,20,24};
//		
//		System.out.println(ages[0]);
		
//		int[] ages1 = new int[5];
//		 ages1[0]= 51;
//		 ages1[1]= 20;
//		 ages1[2]= 24;
//		 System.out.println(ages1[1]);		
//		 
		 
//		
		String wish = "goodnight";
		
		char[] wish1 = wish.toCharArray();
		
//		System.out.println(wish1[8]);
		
		Arrays.sort(wish1);
//		
		System.out.println(Arrays.toString(wish1));
		
		System.out.println(wish1[0]);
		
		System.out.println(wish1[1]);
		
		System.out.println(wish1[2]);
		
		System.out.println(wish1[3]);
		
		
		String salary ="3258468";
		
		char[] salary1 = salary.toCharArray();
		
		Arrays.sort(salary1);
		
		
		
		System.out.println(Arrays.toString(salary1));
		
		System.out.println(salary1[0]);
		
		System.out.println(salary1[1]);
		
		System.out.println(salary1[2]);
		
		System.out.println(salary1[3]);
		
	}

}
