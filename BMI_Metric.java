package mirabalp2;

import java.util.Scanner;

public class BMI_Metric {

	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		double heightInMeters = scnr.nextDouble();
		double weightInKilograms = scnr.nextDouble();
		double BMI = (weightInKilograms)/ (heightInMeters * heightInMeters);
		
		System.out.println("Your BMI is " + BMI + " .");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal Weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		

		scnr.close();
	}

}
