package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {

	@Test
	public void testResultForNameLengthGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForNameLenght(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 10);
	}
	
	@Test
	public void testGenderGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForGender(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForGender(), 10);
	}
	
	@Test
	public void testAgeGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForAge(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForAge(), 10);
	}
	
	@Test
	public void testHomecityGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForHomeCity(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForHomeCity(), 10);
	}

}
