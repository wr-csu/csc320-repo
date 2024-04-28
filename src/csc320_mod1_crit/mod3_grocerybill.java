package csc320_mod1_crit;
import java.util.Scanner;
public class mod3_grocerybill {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double couponValue;
		double weeklyAvg;
		double monthlyAvg;
		double week1Bill;
		double week2Bill;
		double week3Bill;
		double week4Bill;
		
		System.out.println("Please enter coupon value in the form of a decimal (example 50% = 0.5):");
		couponValue = scnr.nextDouble();
		if (couponValue > 1 || couponValue <= 0) {
			couponValue = 0.1;
		}
		
		System.out.println("Please enter week 1 grocery bill:");
		week1Bill = scnr.nextDouble();
		
		System.out.println("Please enter week 2 grocery bill:");
		week2Bill = scnr.nextDouble();
		
		System.out.println("Please enter week 3 grocery bill:");
		week3Bill = scnr.nextDouble();
		
		System.out.println("Please enter week 4 grocery bill:");
		week4Bill = scnr.nextDouble();
		
		weeklyAvg = (week1Bill + week2Bill + week3Bill + week4Bill) / 4;
		monthlyAvg = weeklyAvg * 4;
		
		System.out.println("Weekly average without coupon: " + weeklyAvg);
		System.out.println("Monthly average without coupon: " + monthlyAvg);
		
		System.out.println("Weekly average with coupon: " + weeklyAvg * couponValue);
		System.out.println("Monthly average with coupon: " + monthlyAvg * couponValue);
		
		
	}

}
