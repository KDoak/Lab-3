package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

import pokerExceptions.DeckException;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Deck {
   //
	private ArrayList<Card> deckCards = new ArrayList<Card>();
  
	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				if(eSuit != eSuit.JOKER)
				{
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				}
			}
			 
				
		}
		Collections.shuffle(deckCards);
	}
	
	public Deck(int NbrOfJokers) {

		this();
		for(int j=0;j<NbrOfJokers;j++){
			deckCards.add(new Card (eSuit.JOKER, eRank.JOKER,99));}
		Collections.shuffle(deckCards);
		
	} 
	 
	 
	public Deck(int NbrOfJokers, ArrayList<Card> Wilds) {

		this(NbrOfJokers);
		for (Card c: deckCards)
		{
			for(Card Wild: Wilds)
			{
				if (c.geteRank()==Wild.geteRank() && c.geteRank()== Wild.geteRank());{
					c.setbWild(true);
				}
				
				
			}
		}
	}
	public Card Draw() throws DeckException{
		if (deckCards.size() == 0){
			throw new DeckException(this);}
		return deckCards.remove(0);
		
		
	}
	ArrayList<Card> getDeckCards(){
		return deckCards;
	}
	
	
	public double getDeckSize() {
		return deckCards.size();
	}

}
