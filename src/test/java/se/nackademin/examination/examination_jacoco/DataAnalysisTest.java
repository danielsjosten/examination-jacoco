package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	@Test
	public void testGetResulStringHomecityAndAge() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		
	}
	
	@Test
	public void testGetResultStringNamesAndAge() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		ArrayList<String> values1 = new ArrayList<String>();
		
		values.addAll(Arrays.asList("Game", "123", "123", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue(dataAnalysis.getResultStringNamesAndAge(values),
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));

		values1.addAll(Arrays.asList("Game", "1234", "123", "M", "32", "Fortaleza"));
		String result1 = dataAnalysis.buildFinalString(values1);
		assertTrue(dataAnalysis.getResultStringNamesAndAge(values1),
				result1.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
	}

}
