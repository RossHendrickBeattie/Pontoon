/**
 * @author  Ross Hendrick-Bettie
 * @version 2.0
 * @since   2020-10-28
 */

package Pontoon;

import java.util.ArrayList;

public class Deck 
{
    private ArrayList<Card> deckOfCards;

    /** 
     * Constructs a 52 card deck
    */
    public Deck ()
    {
        deckOfCards = new ArrayList<Card>();

        for (Suit cardsuit : Suit.values()) 
        {
            for (int i = 1; i < 14; i++)
            {
                Card tempCard = new Card(i, cardsuit);
                deckOfCards.add(tempCard);          
            }
        }
    }
    /**
     * 
     * @return the card dealt from the deck
    */
    public Card dealCard()
    {
        int cardReference = (int)(Math.random()*deckOfCards.size());

        Card cardDelt = deckOfCards.get(cardReference);

        deckOfCards.remove(cardReference);

        return cardDelt;
    }
}
