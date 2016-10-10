package pokerExceptions;

import pokerBase.Deck;

public class DeckException extends Exception{
	
	private Deck deck;
	public DeckException(Deck deck){
		super();
		this.deck = deck;
	}
	public Deck getDeck(){
		return deck;
	}
	
}
