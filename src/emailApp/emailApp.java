package emailApp;
import static emailApp.email.*;
import static emailApp.myUtil.*;// For using my own util methods

import java.util.Scanner;

public class emailApp{
	
	
	//Scanner method
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]){
	
		
		ask("Enter First name: ");
		String fname = input.nextLine();
		
		ask("Enter Last name: ");
		String lname = input.nextLine();
		
		//make a new object
		email emailName = new email(fname,lname);
		
		//System.out.println(emailName.getEmailName());
		
		String Dep = emailName.depSelect();
		
		print(Dep);
	}
}