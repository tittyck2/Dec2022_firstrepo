package class7;

public class Sorting {

	public static void main(String[] args) {
		

		
		int [] num = {56, 28, 1, 69, 78, 23, 6, 76};
		

		
		
		
		for (int z : num) {
			
			System.out.print(z + "\t");
			
			
			
		
		}
			
			System.out.println();
			System.out.println("===========================================================");
			
			Sorting s = new Sorting();
			s.sortArray(num);
	}
		
	
	public int[] sortArray(int[] num) {
		
		int temp = 0;

		for (int a =0; a< num.length; a++) {
			
			for (int b=a+1; b<num.length; b++) {
			
				
				if(num[a]> num[b]) {
					
				temp = num[a];
				num[a]= num[b];
				num[b]= temp;
				
				}
				
				
			}
		
		}
			for (int z : num) {
			
			System.out.print(z + "\t");
			
			
		
		}
	
		
		return num;
	}
	            
	           
}



		
		
	

