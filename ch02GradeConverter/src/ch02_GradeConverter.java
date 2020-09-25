import java.util.Scanner;

public class ch02_GradeConverter {

	
	// 1 welcome message
	// * while loop starts
	// 2 get user input numericalGrade
	// 3 biz logic else if statement/ convert numericalGrade to letterGrade
	// 4 display output
	// *  while loop ends
	// 5 bye
	
	
	   public static void main(String[] args) {
		        System.out.println("Welcome to the Letter Grade Converter! :)");
		        System.out.println();  // print a blank line
		        Scanner sc = new Scanner(System.in);
                String choice = "y";
       
        while (choice.equalsIgnoreCase("y")) {
            // get the numerical grade from the user
                System.out.print("Enter numerical grade: ");
        int numericalGrade = sc.nextInt();

            // calculate the grade
            //int numericalGrade;
        if (numericalGrade <= 60 ) 
            	System.out.print("Letter Grade F   ");    
        else if (numericalGrade >= 60 && numericalGrade <= 67) {
            	System.out.print("Letter Grade D   "); }   
        else if (numericalGrade >= 68 && numericalGrade <=79) {
                System.out.print("Letter Grade C   ");}
        else if (numericalGrade >= 80 && numericalGrade  <= 87) {
                System.out.print("Letter Grade B  ");}
        else {
                System.out.println("Letter Grade A  ");
	  }
            // see if the user wants to continue
                System.out.print("Continue? (y/n): ");
                choice = sc.next();
                System.out.println();
                System.out.println("Goodbye :)");
                sc.close();
    
}
        }

}


