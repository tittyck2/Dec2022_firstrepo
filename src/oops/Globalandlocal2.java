package oops;

public class Globalandlocal2 {
	
	
	public int a = 123;
	public static String b = "Global";

	
	public void test1(){
		
		int a = 55;
		System.out.println(a);
		String b = "test1";
		
		
		System.out.println(this.a);
		System.out.println(b);
		
		
		test2();
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int a= 99;
		String b= "How are you";
		
		System.out.println(a);
		System.out.println(b);
		
		Globalandlocal2 glv = new Globalandlocal2();
		
		System.out.println(glv.a);
		System.out.println(Globalandlocal2. b);
		
		
		Globalandlocal2 tt = new Globalandlocal2();
		tt.test1();
		
	}
	
	public static void test2() {
		Globalandlocal2 glx = new Globalandlocal2();
		String b = "bye";
		int a = 101;		
		System.out.println(b);
		System.out.println(a);
		System.out.println(glx.a);
		System.out.println(Globalandlocal2.b);
		
		
	}

}