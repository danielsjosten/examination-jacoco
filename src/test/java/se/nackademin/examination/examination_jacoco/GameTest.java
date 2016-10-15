package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {

	@Test
	public void testRun(){
		Game game = new Game();
//		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Daniel", "Sjösten", "M", "30", "Stockholm"));
//		String result = dataAnalysis.buildFinalString(values);
		game.run(values);
		//assertEquals(values, result.contains("Game", "Daniel", "Sjösten", "M", "30", "Stockholm")); ??

		
		
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

}
