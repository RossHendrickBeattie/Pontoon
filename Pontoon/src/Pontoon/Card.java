/**
 * @author  Ross Hendrick-Bettie
 * @version 1.0
 * @since   2020-10-28
 */

package Pontoon;

public class Card 
{
    private int cardValue;
    private Suit cardSuit;

    public Card(int value, Suit suit)
    {
        cardValue = value;
        cardSuit = suit;
    }

    /**
     * Returns the value of the card.
     * Cards have a maximum value of 10
     * @return
     */
    public int getValue()
    {
        if (cardValue>10)
        {
            return 10;
        }
        else
        {
            return cardValue;
        }
    }

    /**
     * Cards with a value greater than 10 have a specific name.
     * @return  The name of the card.
    */
    public String getCardName()
    {
        String name;

        switch (cardValue)
        {
            case 13:
                name = "King of " + cardSuit;
                break;
            case 12:
                name = "Queen of " + cardSuit;
                break;
            case 11:
                name = "Jack of " + cardSuit;
                break;
            default:
                name = cardValue + " of " + cardSuit;
        }
        
        return name;
    }

}
