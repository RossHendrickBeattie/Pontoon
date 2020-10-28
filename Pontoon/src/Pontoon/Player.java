/**
 * @author  Ross Hendrick-Bettie
 * @version 1.0
 * @since   2020-10-28
 */

package Pontoon;

import java.util.ArrayList;

/**
 * Player abstract, to contain the common attributes and methods in Human and AI players
 * 
 */
public abstract class Player 
{
    protected String mName;
    protected ArrayList<Card> mHand;
    protected int mHandTotal;
    
    /**
     * 
     */
    public Player()
    {
        mHand = new ArrayList<Card>();
    }

    public void updateHandTotal()
    {
        int newTotal = 0;

        for (Card card : mHand) 
        {
            newTotal += card.getValue();
        }

        this.mHandTotal = newTotal;
    }

    public int getHandTotal()
    {
        return mHandTotal;
    }

    public String getName()
    {
        return mName;
    }

    public abstract void takeTurn();

    public abstract void drawCard();
}
