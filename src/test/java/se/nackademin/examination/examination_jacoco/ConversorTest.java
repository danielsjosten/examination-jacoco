package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class ConversorTest {

	@Test
	public void testConversor() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
	}
	
	@Test
	public void testSetGenderConverterArrayValues() {
		
		Conversor conversor = new Conversor();
		conversor.setGenderConverterArrayValues();
		
		
		assertEquals(conversor.getGenderConverterArray().get(0), "man!");

		
	}

}
