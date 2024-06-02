package csc320_mod1_crit;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class AutomobileInventory {
	private String Make;
	private String Model;
	private String Color;
	private int Year;
	private int Mileage;
	
	private ArrayList<AutomobileInventory> AutoList = new ArrayList <AutomobileInventory> ();
	
	public AutomobileInventory() { //default constructor
		Make = "none";
		Model = "none";
		Color = "none";
		Year = 0;
		Mileage = 0;
	}
	
	public AutomobileInventory(String make, String model, String color, int year, int mileage) { //parameterized constructor
		Make = make;
		Model = model;
		Color = color;
		Year = year;
		Mileage = mileage;
	}
	//setters v
	public void setMake(String make) {
		Make = make;
	}
	public void setModel(String model) {
		Model = model;
	}
	public void setColor(String color) {
		Color = color;
	}
	public void setYear(int year) {
		Year = year;
	}
	public void setMileage(int mileage) {
		Mileage = mileage;
	}
	//getters v
	public String getMake() {
		return Make;
	}
	public String getModel() {
		return Model;
	}
	public String getColor() {
		return Color;
	}
	public int getYear() {
		return Year;
	}
	public int getMileage() {
		return Mileage;
	}

	public void addAutomobile(AutomobileInventory newAutomobile) { //adds new car to list
		AutoList.add(newAutomobile);
	}
	
	public void removeAutomobile(String userMake) { //removes car from list
		try {
			for(int i =0; i < AutoList.size(); ++i) {
				if(AutoList.get(i).getMake().equals(userMake)) {
					System.out.println(userMake + " was removed from inventory");
					AutoList.remove(i);
				
					break;
				}
				if ( i == AutoList.size() - 1 && ! AutoList.get(i).getMake().equals(userMake)){
					System.out.println("Automobile not found in inventory. Nothing removed.");
					break;
				}
			}
		}catch(NumberFormatException e) {
			System.out.println("Invalid Make");
		}
	}
	
	public void updateAttributes(AutomobileInventory Car, String userMake, String userModel, String userColor, int userYear, int userMileage) { //updates attributes
		for(int i = 0; i < AutoList.size() ; ++i) {
			if (i == AutoList.size() -1  && !AutoList.get(i).getMake().equals(userMake)){
				System.out.println("Automobile not found in inventory. Nothing updated.");
		        break;
		    }
			if(AutoList.get(i).getMake().equals(userMake)){
				AutoList.set(i, new AutomobileInventory(userMake,userModel,userColor,userYear, userMileage));
				AutoList.get(i).setModel(userModel);
				AutoList.get(i).setColor(userColor);
				AutoList.get(i).setYear(userYear);
				AutoList.get(i).setMileage(userMileage);
				break; 
			}
		}
	}
	
	
	public void printAutomobile(String userMake, char Choice) throws IOException {
		try {	
			if(Choice == 'N') {	
				for(int i = 0; i < AutoList.size(); ++i) {
					if(AutoList.get(i).getMake().equals(userMake)) {
						System.out.println(AutoList.get(i).getMake());
						System.out.println("   " + AutoList.get(i).getModel());
						System.out.println("   " + AutoList.get(i).getColor());
						System.out.println("   " + AutoList.get(i).getYear());
						System.out.println("   " + AutoList.get(i).getMileage());	
					}
					if(!AutoList.get(i).getMake().equals(userMake) && i == AutoList.size() -1) {
						System.out.println("Automobile not found");
					}
					if (AutoList.size() == 0) {
						System.out.println("List Empty");
					}
					}
				System.out.println("Okay we will not print out this information to file");
			}
			if(Choice == 'Y') {
				File automobileInfo = new File("C:\\Users\\wnric\\Documents\\school work\\B csc320 notes & work\\AutoList_mod8_project\\AutoListmod8");
				automobileInfo.getParentFile().mkdirs();
				PrintWriter outInfo = new PrintWriter(automobileInfo);
				
					for(int i = 0; i < AutoList.size(); ++i) {
						if(AutoList.get(i).getMake().equals(userMake)) {
							outInfo.println(AutoList.get(i).getMake());
							outInfo.println("   " + AutoList.get(i).getModel());
							outInfo.println("   " + AutoList.get(i).getColor());
							outInfo.println("   " + AutoList.get(i).getYear());
							outInfo.println("   " + AutoList.get(i).getMileage());
						}
				}
				outInfo.close ();
			}
			}catch (NumberFormatException e) {
				System.out.println("Invalid Make");
			}
	}
			
	
	public void printAutomobileInventory() {
			for(int i = 0; i < AutoList.size(); ++i) {
				System.out.println(AutoList.get(i).getMake());
				System.out.println("   " + AutoList.get(i).getModel());
				System.out.println("   " + AutoList.get(i).getColor());
				System.out.println("   " + AutoList.get(i).getYear());
				System.out.println("   " + AutoList.get(i).getMileage());
				System.out.println("");
				if (AutoList.size() == 0) {
					System.out.println("List Empty");
		
				}
			}
	}

	
	public void printSpecificAttributes(String userInput) {
		try {
			int userNum = Integer.parseInt(userInput);
			for(int i = 0; i < AutoList.size(); ++i) {
				if(AutoList.get(i).getYear() == userNum || AutoList.get(i).getMileage() == userNum) {
					System.out.println(AutoList.get(i).getMake());
					System.out.println("   " + AutoList.get(i).getModel());
					System.out.println("   " + AutoList.get(i).getColor());
					System.out.println("   " + AutoList.get(i).getYear());
					System.out.println("   " + AutoList.get(i).getMileage());
					System.out.println("");
				}
				if (AutoList.size() == 0) {
					System.out.println("List Empty");
				}
				if(i == AutoList.size()  && (userNum != AutoList.get(i).getYear() || userNum != AutoList.get(i).getMileage())) {
					System.out.println("Attribute not Found");
				}
				
			}
	
		}catch(NumberFormatException e) {
			for(int i = 0; i < AutoList.size(); ++i) {
				if(AutoList.get(i).getMake().equals(userInput) || AutoList.get(i).getModel().equals(userInput) || AutoList.get(i).getColor().equals(userInput) ) {
					System.out.println(AutoList.get(i).getMake());
					System.out.println("   " + AutoList.get(i).getModel());
					System.out.println("   " + AutoList.get(i).getColor());
					System.out.println("   " + AutoList.get(i).getYear());
					System.out.println("   " + AutoList.get(i).getMileage());
					System.out.println("");
				}
				if (AutoList.size() == 0) {
					System.out.println("List Empty");
				}
				if(i == AutoList.size() && (!AutoList.get(i).getMake().equals(userInput) || !AutoList.get(i).getModel().equals(userInput) || !AutoList.get(i).getColor().equals(userInput))) {
					System.out.println("Attribute not Found");
				}
			}
			
		}	
	
	
	
	
		
	}
}

	
	
	
	
	
