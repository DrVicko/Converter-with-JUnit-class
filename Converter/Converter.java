package Converter;
import java.util.InputMismatchException;
import java.util.Scanner; 

public class Converter 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double number; 
		int selection = -1; 
		Conversions conversion = new Conversions(); 
		
		while (selection != 0)
		{
			try
			{
				System.out.println("\nSelect: \n1. To convert kilograms into pounds \n2. To convert pounds into kilograms "
					+ "\n3. To convert centimeters into inches \n4. To convert inches into centimeters "
					+ "\n5. To convert celsius into fahrenheit \n6. To convert fahrenheit into celsius \n0. To exit converter");
		   
				selection = input.nextInt(); 
			} catch (InputMismatchException ex)
			{
				System.out.println("Error!! Input must be integer, please try again");
				input.nextLine(); 
			}
			
			if (selection == 1)
			{
				System.out.println("Enter amount of kilograms you want to convert: ");
				number = input.nextDouble(); 
				double result = conversion.kgIntoPounds(number);
				System.out.println(number + " kilograms is " + result + " pounds. " );
			}
			
			if (selection == 2)
			{
				System.out.println("Enter amount of pounds you want to convert: ");
				number = input.nextDouble(); 
				double result = conversion.poundsIntoKg(number);
				System.out.println(number + " pounds is " + result + " kilograms. " );
			}
			
			if (selection == 3)
			{
				System.out.println("Enter amount of centimeters you want to convert: ");
				number = input.nextDouble(); 
				double result = conversion.cmIntoInches(number);
				System.out.println(number + " centimeters is " + result + " inches. " );
			}
			
			if (selection == 4)
			{
				System.out.println("Enter amount of inches you want to convert: ");
				number = input.nextDouble(); 
				double result = conversion.inchesIntoCm(number);
				System.out.println(number + " inches is " + result + " centimeters. " );
			}
			
			if (selection == 5)
			{
				System.out.println("Enter amount of celsius you want to convert: ");
				number = input.nextDouble(); 
				double result = conversion.celsiusIntoFahrenheit(number);
				System.out.println(number + " celsius is " + result + " fahrenheit. " );
			}
			
			if (selection == 6)
			{
				System.out.println("Enter amount of fahrenheit you want to convert: ");
				number = input.nextDouble(); 
				double result = conversion.fahrenheitIntoCelsius(number);
				System.out.println(number + " fahrenheit is " + result + " celsius. " );
			}
			
			if (selection == 0)
			{
				break; 
			}
		}
		input.close();
	}

}
