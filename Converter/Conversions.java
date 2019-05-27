package Converter;

public class Conversions 
{
	public double kgIntoPounds (double number)
	{
		return number * 2.20462; 
	}
	public double poundsIntoKg (double number)
	{
		return number * 0.453592;
	}
	public double cmIntoInches (double number)
	{
		return number * 0.393701; 
	}
	public double inchesIntoCm (double number)
	{
		return number * 2.54; 
	}
	public double celsiusIntoFahrenheit (double number)
	{
		return number * 9 / 5 + 32; 
	}
	public double fahrenheitIntoCelsius (double number)
	{
		return ((number - 32) * 5 / 9);  
	}

}
