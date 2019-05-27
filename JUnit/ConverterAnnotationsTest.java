package JUnit;

import static org.junit.Assert.*;
import Converter.Conversions;

import org.junit.Test;
import org.junit.Before; 

public class ConverterAnnotationsTest 
{
	Conversions conversion;
	
	@Before
	public void setUp ()
	{
		conversion = new Conversions (); 
	}

	@Test
	public void kgIntoPoundsTest ()
	{
		double result = conversion.kgIntoPounds (10);
		assertEquals(22.0462, result, 0.1);
	}
	
	@Test
	public void poundsIntoKgtest ()
	{
		double result = conversion.poundsIntoKg(10);
		assertEquals(4.53592, result, 0.1);
	}
	
	@Test
	public void cmIntoInchesTest ()
	{
		double result = conversion.cmIntoInches(10);
		assertEquals(3.93701, result, 0.1);
	}
	
	@Test
	public void inchesIntoCmTest ()
	{
		double result = conversion.inchesIntoCm(10);
		assertEquals(25.4, result, 0.1);
	}
	
	@Test
	public void celsiusIntoFahrenheitTest ()
	{
		double result = conversion.celsiusIntoFahrenheit(22.55);
		assertEquals(72.59, result, 0.1);
	}
	
	@Test
	public void fahrenheitIntoCelsiusTest ()
	{
		double result = conversion.fahrenheitIntoCelsius(60);
		assertEquals(15.5556, result, 0.1);
	}

}
