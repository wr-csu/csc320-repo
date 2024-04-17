package csc320_mod1_crit;
import java.util.Scanner;
public class mod1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	    String firstName;
	    String lastName;
	    String Address;
	    String City;
	    String Zipcode;
	    
	    System.out.println("What is your first name?");
	    firstName = scnr.nextLine();
	    System.out.println("What is your last name?");
	    lastName = scnr.nextLine();
	    System.out.println("What is your address?");
	    Address = scnr.nextLine();
	    System.out.println("What is the name of the city you live in?");
	    City = scnr.nextLine();
	    System.out.println("What is your zipcode?");
	    Zipcode = scnr.nextLine(); 
	    System.out.println(firstName);
	    System.out.println(lastName);
	    System.out.println(Address);
	    System.out.println(City);
	    System.out.println(Zipcode);

	}

}
