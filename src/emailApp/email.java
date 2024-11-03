package emailApp;
import static emailApp.myUtil.*;// For using my own util methods

import java.util.Scanner;



public class email {
	
	//Scanner method
	private static Scanner input = new Scanner(System.in);
	
	private String firstname;
	private String lastname;
	private String userName = null; // firstName.LastName
	
	private String department = null;
	private String password = null;
	
	private int mailBoxCap;
	private String alterEmail;


	//Constructor to get first name and last name
	public email(String fname, String lname){
		userName = fname+"."+lname;
	}

	public String getEmailName() {
		return userName;
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
				return "Sales";
			}
			else if ( opt == 2) {
				return "Development";
			}
			else if ( opt == 3) {
				return "Accounting";
			}	
			else if ( opt == 4 ) {
				return "";
			}
			
			else {
				print("Wrong input Try again");
			}
		}
		return null;
		
	}
	
}