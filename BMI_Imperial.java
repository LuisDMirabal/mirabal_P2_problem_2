package mirabalp2;

import java.util.Scanner;

public class BMI_Imperial {

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		
		double heightInInches = scnr.nextDouble();
		double weightInPounds = scnr.nextDouble();
		double BMI = (703 * weightInPounds)/ (heightInInches * heightInInches);
		
		System.out.println("Your BMI is " + BMI + " .");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal Weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		

		scnr.close();
	}

}
