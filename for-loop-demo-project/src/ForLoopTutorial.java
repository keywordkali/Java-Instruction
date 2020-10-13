
public class ForLoopTutorial {

	public static void main(String[] args) {
	
		//below is the for each loop 
		// used for collections of things like arrays  
		
		int[] ints = new int[] {1,1,2,3,5,8,13};
		int total0 = 0;
		for(int i : ints) {
			total0 += i;
		}
		System.out.println("total0 = "+total0);
		
		int[] odds = new int[] {1,3,5,7,9,11};
		int total3 = 0;
				for(int i : odds) {
					total3 += i;
				}
		System.out.println("Total3: "+total3);
		
		
		
		
		
		
		
		
		
		
		
		// old school for loop
		int total = 0;
		for(int i = 0; i<= 50; i++) {
		if(i % 5 == 0 || i % 7 == 0) {
			total += i;
		}
		
	}
	System.out.println("Total: "+total);
		//is ideal for doing something n number of times in this case 10 
	   // anytime you want to deal with a range of numbers
	
	//public static void main(String[]args) {
		int total2 = 0;
				for(int i = 3; i <= 15; i++) {
					if(i % 2 == 0) {
						total2 += i;
					}
				
				}
	System.out.println("Total: "+total2);
	}

}
