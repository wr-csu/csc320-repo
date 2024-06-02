package csc320_mod1_crit;
import java.util.Scanner;
import java.io.IOException;
public class AutoMobileInventory_main {

	public static void printMenu() {
		System.out.println("MENU");
		System.out.println("   a - add vehicle");
		System.out.println("   r - remove vehicle");
		System.out.println("   c - change a vehicle's attributes");
		System.out.println("   d - display a vehicle's information");
		System.out.println("   o - output entire vehicle inventory list");
		System.out.println("   p - print all vehicle's with a specific attribute");
		System.out.println("   q - quit");
		System.out.println("");
		
	}
	
	public static char chooseOption(AutomobileInventory AutoList, Scanner scnr) {
		System.out.println("Choose option:");
		char input = scnr.next().charAt(0);
		input = Character.toUpperCase(input);
		return input;
	}
	
	public static boolean checkIfString(String input) { //to help repeat try-catch loops
		boolean check = false;
		for(int i = 0; i < input.length(); ++i) {
			if(!Character.isDigit(input.charAt(i)) ) {
				check = true;
				break;
			}
		}
		return check;
	}
	
	
	public static void main(String[] args) throws IOException {
		Scanner scnr = new Scanner(System.in);
		AutomobileInventory AutoList = new AutomobileInventory();
		
		String userMake = "";
		String make = "", model = "", color = "";
		
		int year = 0, mileage = 0;
		AutomobileInventory newCar = new AutomobileInventory(make,model,color,year,mileage);
		char input = ' ';
		
		while(input != 'Q') {
			printMenu();
			input = chooseOption(AutoList,scnr);
			
			switch(input) {
			
				case 'A':
				
					make = ""; model = ""; color= "";
					System.out.println("Add vehicle:");
					boolean check = checkIfString(make); 
					while (check == false) {
						try {
							System.out.println("Enter vehicle make:");
							make = scnr.next().toUpperCase();
							if(checkIfString(make) == false) {
								throw new IllegalArgumentException("Invalid make! try again");
							}
							check = true;
						}catch(IllegalArgumentException e) {
						System.out.println(e.getMessage());
						}
					}
					check = checkIfString(model);
					while (check == false) {
						try {	
							System.out.println("Enter vehicle model:");
							model = scnr.next().toUpperCase();
							if(checkIfString(model) == false) {
								throw new IllegalArgumentException("Invalid model! try again");
							}
							check = true;						
						}catch(IllegalArgumentException e) {
							System.out.println(e.getMessage());							
						}
					}
					check = checkIfString(color);
					while (check == false) {
						try {
							System.out.println("Enter vehicle color:");
							color = scnr.next().toUpperCase();
							if(checkIfString(color) == false) {
								throw new IllegalArgumentException("Invalid color! try again");
							}
							check = true;
						}catch(IllegalArgumentException e) {
							System.out.println(e.getMessage());							
						}
					}					
					check = false;
					while (check == false) {
						try {
							System.out.println("Enter year vehicle was produced:");
							year = Integer.parseInt(scnr.next());							
							if(year < 1886) {
								throw new IllegalArgumentException("Invalid Year! try again");
							}							
							check = true;						
						}catch(NumberFormatException e) {
							System.out.println("Invalid Year! try again");							
						}catch(IllegalArgumentException e) {
							System.out.println(e.getMessage());							
						}						
					}					
					check = false;
					while (check == false) {
						try {
							System.out.println("Enter vehicle mileage:");
							mileage = Integer.parseInt(scnr.next());
							if(mileage <= 0) {
								throw new IllegalArgumentException("Invalid Mileage! try again");
							}
							check = true;
						}catch(NumberFormatException e) {
							System.out.println("Invalid Mileage! try again");														
						}catch(IllegalArgumentException e) {
							System.out.println(e.getMessage());							
						}					
					}
					check = false;
					newCar = new AutomobileInventory(make,model,color,year,mileage);
					newCar.setColor(color);
					newCar.setMake(make);
					newCar.setMileage(mileage);
					newCar.setYear(year);
					newCar.setModel(model);
					AutoList.addAutomobile(newCar);
					System.out.println("");
					break;
			
				case 'R':
				
					System.out.println("Remove vehicle:");
					userMake = "";
					while (checkIfString(userMake) == false) {
						try {
							System.out.println("Enter vehicle make:");
							userMake = scnr.next().toUpperCase();
							if(checkIfString(userMake) == false) {
								throw new IllegalArgumentException("Invalid make! try again:");
							}
						}catch(IllegalArgumentException e) {
						System.out.println(e.getMessage());
						userMake = scnr.next().toUpperCase();
						}
					}
					AutoList.removeAutomobile(userMake);
					System.out.println("");
					break;
					
				case 'C':
				
					
					System.out.println("Change a vehicle's attributes:");
					while (checkIfString(userMake) == false) {
						try {
							System.out.println("Enter vehicle make:");
							userMake = scnr.next().toUpperCase();
							if(checkIfString(userMake) == false) {
								throw new IllegalArgumentException("Invalid make! try again:");
							}
						}catch(IllegalArgumentException e) {
						System.out.println(e.getMessage());
						userMake = scnr.next().toUpperCase();
						}
					}
					check = false;
					while (check == false) {
						try {	
							System.out.println("Enter vehicle model:");
							model = scnr.next().toUpperCase();
							if(checkIfString(model) == false) {
								throw new IllegalArgumentException("Invalid model! try again");
							}
							check = true;						
						}catch(IllegalArgumentException e) {
							System.out.println(e.getMessage());							
						}
					}
					check = false;
					while (check == false) {
						try {
							System.out.println("Enter vehicle color:");
							color = scnr.next().toUpperCase();
							if(checkIfString(color) == false) {
								throw new IllegalArgumentException("Invalid color! try again");
							}
							check = true;
						}catch(IllegalArgumentException e) {
							System.out.println(e.getMessage());							
						}
					}					
					check = false;
					while (check == false) {
						try {
							System.out.println("Enter year vehicle was produced:");
							year = Integer.parseInt(scnr.next());							
							if(year < 1886) {
								throw new IllegalArgumentException("Invalid Year! try again");
							}							
							check = true;						
						}catch(NumberFormatException e) {
							System.out.println("Invalid Year! try again");							
						}catch(IllegalArgumentException e) {
							System.out.println(e.getMessage());							
						}						
					}					
					check = false;
					while (check == false) {
						try {
							System.out.println("Enter vehicle mileage:");
							mileage = Integer.parseInt(scnr.next());
							if(mileage <= 0) {
								throw new IllegalArgumentException("Invalid Mileage! try again");
							}
							check = true;
						}catch(NumberFormatException e) {
							System.out.println("Invalid Mileage! try again");														
						}catch(IllegalArgumentException e) {
							System.out.println(e.getMessage());							
						}					
					}
					check = false;
					
					
					AutoList.updateAttributes(newCar, userMake, model, color, year, mileage);
					System.out.println("");
					break;
				
				case 'D':
				
					System.out.println("Display a vehicle's information");
					System.out.println("Enter a vehicle's make:");
					userMake = scnr.next().toUpperCase();
					System.out.println("");
					System.out.println("Do you wish to print Information to file (Y/N)?");
					
					char Choice = scnr.next().charAt(0);
					while(Choice != 'Y' && Choice != 'N') {
						System.out.println("Invalid choice! please choose either Y or N");
					}
					
					AutoList.printAutomobile(userMake, Choice);
					
					break;
				
				case 'O':
				
					System.out.println("Output entire inventory list:");
					AutoList.printAutomobileInventory();
					System.out.println("");
					break;
					
				case 'P':
				
					System.out.println("Print all vehicle's with a specific attribute");
					System.out.println("Enter vehicle attribute:");
					String userTrait = scnr.next().toUpperCase();
					AutoList.printSpecificAttributes(userTrait);
					System.out.println("");
					break;	
				
				
			}
				
		}
	

		System.out.println("GOODBYE");
		
		scnr.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
