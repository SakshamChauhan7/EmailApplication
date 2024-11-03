package emailApp;
import static emailApp.myUtil.*;// For using my own util methods

import java.util.Scanner;



public class email {
	
	//Scanner method
	private static Scanner input = new Scanner(System.in);
	
	private String firstname;
	private String lastname;
	private String userName = null; // firstName.LastName
	private String email = null; // Final complete email
	private String companyName = "Stech"; //preset company name
	
	
	private String department = null;
	private String password = null;
	
	private int mailBoxCap;
	private String alterEmail;


	//Constructor to get first name and last name
	public email(String fname, String lname){
		//for data purpose add first and last name
		firstname = fname;
		lastname = lname;
		
		
		userName = fname+"."+lname;
	}

	public String getEmailName() {
		email = userName +"@"+ department + companyName + ".com";
		return email;
	}
	
	public String depSelect() {
		
		int opt = 4;
		boolean exit = false;
		
		while(!exit) {
			print("+++++++++++++++++++++++++++++");
			print("Select the Department");
			print("1: Sales");
			print("2. Development");
			print("3: Accounting");
			print("4: None");
			print("+++++++++++++++++++++++++++++");
			print();
			ask("You choose: ");
			opt = input.nextInt();
			input.nextLine(); // to remove space from buffer
			
			// Configure sales as 1, development as 2, accounting as 3
			// The check for the over bound value will be placed at actuall 
			if( opt == 1) {
				department = "Sales."; 
				return department;
			}
			else if ( opt == 2) {
				department = "Development."; 
				return department;
				
			}
			else if ( opt == 3) {
				department = "Accounting.";
				return department;
			}	
			else if ( opt == 4 ) {
				department = "";
				return department;
			}
			
			else {
				print("Wrong input Try again");
			}
		}
		return null;
		
	}
	
}