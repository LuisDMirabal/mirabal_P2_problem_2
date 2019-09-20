package mirabalp2;

import java.util.Scanner;

public class BMI_Imperial {

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		double BMI;

		System.out.print("How would you like to calculate your BMI: lb or kg = ");
		
		String system = scnr.next();
		System.out.println("");
		
		if(system.equals("lb"))
		{
			System.out.print("Please enter your weight in pounds: ");
			double weightInPounds = scnr.nextDouble();
			System.out.println("");
			System.out.print("Please enter your height in inches: ");
			double heightInInches = scnr.nextDouble();
			System.out.println("");
			
			BMI= (703*weightInPounds)/ (heightInInches * heightInInches);
		}
		
		else
		{
			System.out.print("Please enter your weight in kilograms: ");
			double weightInKilograms = scnr.nextDouble();
			System.out.println("");
			System.out.print("Please enter your height in meters: ");
			double heightInMeters = scnr.nextDouble();
			System.out.println("");
			
			BMI= (weightInKilograms)/ (heightInMeters * heightInMeters);
		}
		
		
		
		
		System.out.println("Your BMI is " + BMI + " .");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal Weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		

		scnr.close();
	}

}
