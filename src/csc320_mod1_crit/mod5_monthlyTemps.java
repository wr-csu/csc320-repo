package csc320_mod1_crit;
import java.util.Scanner;
public class mod5_monthlyTemps {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int i = 0;
		String [] Months = new String [12];
		Months[0] = "JAN";
		Months[1] = "FEB";
		Months[2] = "MAR";
		Months[3] = "APR";
		Months[4] = "MAY";
		Months[5] = "JUN";
		Months[6] = "JUL";
		Months[7] = "AUG";
		Months[8] = "SEPT";
		Months[9] = "OCT";
		Months[10] = "NOV";
		Months[11] = "DEC";
		
		double [] tempsList = new double [12];
		tempsList[0] = 35.15;
		tempsList[1] = 36.43;
		tempsList[2] = 40.62;		
		tempsList[3] = 51.35;
		tempsList[4] = 62.4;
		tempsList[5] = 69.01;
		tempsList[6] = 75.65;
		tempsList[7] = 74.35;
		tempsList[8] = 67.77;
		tempsList[9] = 56.08;
		tempsList[10] = 44.29;
		tempsList[11] = 39.83;

		double yearAvg = 0;
		double max = tempsList[0];
		int maxMonth = 0;
		double min = tempsList[0];
		int minMonth = 0;
		String input = "";
		
		while (!input.equals("Q")){
			System.out.println("Average Temperature in the U.S. during 2023");
			System.out.println("Enter year to check all months, receive yearly average, and highest/lowest temperatures");
			System.out.println("Enter month to check (in abbreviated form)");
			System.out.println("Enter q or Q to quit");
			input = scnr.nextLine().toUpperCase();
			
			if (input.equals("YEAR")) { 
				for (i = 0; i < tempsList.length; ++i) {
					System.out.println(Months[i] + ": " + tempsList[i] + " Fahrenheit");
					yearAvg += tempsList[i];
					if (tempsList[i] < min) {
						min = tempsList[i];
						minMonth = i;
					}
					if (tempsList[i] > max) {
						max = tempsList[i];
						maxMonth = i;
					}
				}
				System.out.println("Yearly Average: " + (yearAvg / 12)  + " Fahrenheit");
				System.out.println("Highest Temperature: " + Months[maxMonth] + " " + max  + " Fahrenheit");
				System.out.println("Lowest Temperature: " + Months[minMonth] + " " + min  + " Fahrenheit");
				System.out.println("");
			}
			
			for (i =0; i < Months.length; i++) {
				if (input.equals(Months[i])){
					System.out.println(Months[i] + ": " + tempsList[i] + " Fahrenheit");
					break;
				}
				if (i == Months.length -1 && !input.equals(Months[i]) && !input.equals("YEAR") && !input.equals("Q")) {
					System.out.println("Invalid Month! TRY AGAIN");
					break;
				}	
			}
			System.out.println("");
		}
		System.out.print("GOODBYE");
	}

}
