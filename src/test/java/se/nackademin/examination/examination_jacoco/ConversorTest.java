package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConversorTest {

	@Test
	public void testConversor() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
	
		conversor.setAgeConverterArrayValues();
		assertEquals(conversor.getAgeConverterArray().get(0), "You are young and talented! Things will come your way soon enough! ");
	
		conversor.setGenderConverterArrayValues();
		assertEquals(conversor.getGenderConverterArray().get(0), "man!");
		
		conversor.setCityConverterArrayValues();
		assertEquals(conversor.getCityConverterArray().get(0), " A, ");
	}
	
}
