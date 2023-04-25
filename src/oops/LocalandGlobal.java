package oops;

public class LocalandGlobal {

	public  int a = 75;
	public static String b = "testing";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 89;
		String b = "bobby";
		System.out.println(a);
		
		
		LocalandGlobal lg = new LocalandGlobal();
		System.out.println(lg.a);
		
		System.out.println(b);
		LocalandGlobal lk = new LocalandGlobal();
		System.out.println(lk.b);
		
		t1();
		

	}
	
	public static void t1() {
		
		int a = 78;
		String b = "hallo";
		System.out.println(a);
		
		
				
	}
	public void t2() {
		
		int a = 555;
		
		System.out.println(a);
		LocalandGlobal lm = new LocalandGlobal();
		System.out.println(lm.a);
		
	}
}
