package csc320_mod1_crit;
import java.util.Scanner;
public class mod4_gradeStatistics {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		float grade;
		float avg = 0;
		float max = 0;
		float min = 0;
		int i = 0;
		for (i = 0; i < 10; ++i ) {
			System.out.println("Enter grade: ");
			grade = scnr.nextFloat();
			avg += grade;
			if (grade > max) {
				max = grade;
			}
			if (i == 0) {
				min = grade;
			}
			if (grade < min) {
				min = grade;
			}			
		}
		avg /= i;
		System.out.println("Grade Average = " + avg);
		System.out.println("Highest Grade = " + max);
		System.out.print("Lowest Grade = " + min);													
	}

}
