import java.util.Scanner;
public class StudentRegistrationApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Student Registration App!");
		System.out.println();
		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		System.out.println();
		System.out.println("Enter Last Name: ");
		String lastName = sc.next();
		System.out.println();
		System.out.println("Enter year of birth: ");
		int birthday = sc.nextInt();
		
		System.out.println("Welcome "+firstName+" "+lastName+"!");
        System.out.println("Your registration is complete."); 
        System.out.println("Your temporary password is "+(firstName)+("*")+birthday);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Bye!");

	}

}
