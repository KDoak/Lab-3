package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Deck {

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
		for (Card c: Wilds)
		{
			for(Card d: deckCards)
			{
				if (c.geteSuit()==d.geteSuit() && c.geteRank()==d.geteRank());{
					setbWild(c);
				}
				else return false
				
			}
		}
	}
	public Card Draw(){
		
		
		//TODO Lab 3 - Implement exception handling for overdraw
		return deckCards.remove(0);
	}
}
