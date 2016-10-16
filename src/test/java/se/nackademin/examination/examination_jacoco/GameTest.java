package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {

	@Test
	public void testRun(){
		Game game = new Game();
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Daniel", "Sjösten", "M", "30", "Stockholm"));
		String result = dataAnalysis.buildFinalString(values);
		game.run(values);
		assertEquals(result, "#####################-- ANALYSIS OF THE INPUT DATA --#####################\n" +
"The first name is smaller or equals in size to the last name and the participant is 30 or younger\n" +
"The name of the homecity is big and the participant is 30 or older");	
		//assertEquals(values, result.contains("Game", "Daniel", "Sjösten", "M", "30", "Stockholm"));	
	}
	
	
	@Test
	public void testCalculateOutPutBasedOnNames() {
		Game game = new Game();
		
		int i = game.calculateOutPutBasedOnNames("Daniel", "Sjösten");
		assertEquals("The result should be 0", i, 0);
		
		i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
		
		i = game.calculateOutPutBasedOnNames("Kalle", "Kalle");
		assertEquals("The result should be 2", i, 2);
	}
	
	@Test
	public void testCalculateOutPutBasedOnGender() {
		Game game = new Game();
		
		//Downcasting int to char just to try it out
		char c = (char) game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", c, 0);
		
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", i, 0);
		
		c = (char) game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", c, 1);
		
		c = (char) game.calculateOutPutBasedOnGender('N');
		assertEquals("The result should be 2", c, 2);
		

	}
	
	@Test
	public void testCalculateOutPutBasedOnAge() {
		Game game = new Game();
		
		int i = game.calculateOutPutBasedOnAge(25);
		assertEquals("The result should be 0", i, 0);
		
		i = game.calculateOutPutBasedOnAge(26);
		assertEquals("The result should be 1", i, 1);
	}
	
	@Test
	public void testCalculateOutPutBasedOnHomeCity() {
		Game game = new Game();
		
		int i = game.calculateOutPutBasedOnHomeCity("Alingsås");
		assertEquals("The result should be 0", i, 0);
		
		i = game.calculateOutPutBasedOnHomeCity("Borås");
		assertEquals("The result should be 1", i, 1);
		
		i = game.calculateOutPutBasedOnHomeCity("Charlottenberg");
		assertEquals("The result should be 2", i, 2);
		
		i = game.calculateOutPutBasedOnHomeCity("Dalby");
		assertEquals("The result should be 3", i, 3);
		
		i = game.calculateOutPutBasedOnHomeCity("Ekerö");
		assertEquals("The result should be 4", i, 4);
		
		i = game.calculateOutPutBasedOnHomeCity("Falun");
		assertEquals("The result should be 5", i, 5);
		
		i = game.calculateOutPutBasedOnHomeCity("Göteborg");
		assertEquals("The result should be 6", i, 6);
		
		i = game.calculateOutPutBasedOnHomeCity("Halmstad");
		assertEquals("The result should be 7", i, 7);
		
		i = game.calculateOutPutBasedOnHomeCity("Ingared");
		assertEquals("The result should be 8", i, 8);
		
		i = game.calculateOutPutBasedOnHomeCity("Jönköping");
		assertEquals("The result should be 9", i, 9);
		
		i = game.calculateOutPutBasedOnHomeCity("1");
		assertEquals("The result should be 10", i, 10);
	}

}
