import java.util.Scanner;

public class ch02_ProjectStudentRegistration {

	public static void main(String[] args) {
		 System.out.println("Welcome to the Student Registration Form");
	        System.out.println();  // print a blank line
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Please enter your first name:");
	        String firstname = sc.nextLine();
	        System.out.println("Please enter your last name:");
	        String lastname = sc.nextLine();
	        System.out.println("Please enter your year of birth:");
	        int yearofbirth = sc.nextInt();
	        
	        System.out.println("Welcome "+firstname+" "+lastname+"!");
	        System.out.println("Your registration is complete."); 
	        System.out.println("Your temporary password is "+(firstname)+("*")+yearofbirth);
	
	
	}

}
