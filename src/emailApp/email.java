package emailApp;
import static emailApp.myUtil.*;// For using my own util methods


public class email {
	
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	
	private int mailBoxCap;
	private String alterEmail;


	//Constructor to get first name and last name
	public email(String fname, String lname){
		String emailName = fname+"."+lname;
	}

	
	public String depSelect(int opt) {
		
		
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
			
			else {
				print("Wrong input Try again");
			}
		}
		return null;
		
	}
	
}