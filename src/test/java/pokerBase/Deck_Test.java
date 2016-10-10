package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerExceptions.DeckException;
import pokerExceptions.HandException;
import pokerEnums.eHandStrength;


public class Deck_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void IsDrawACardTest() throws DeckException{
		Deck testDeck = new Deck();
		Object notCard = testDeck.Draw();
		if(!(notCard instanceof Card)){
			fail("DeckException: What was drawn was not a card.");
		}
		
	}
	@Test (expected = DeckException.class)
	public void DrawTooManyTest() throws Exception {
		Deck testDeck = new Deck();
		Card testCard = null;
		for (int i = 0; 1 < 100; i++){
			testCard = testDeck.Draw();		
		}
	}

}
