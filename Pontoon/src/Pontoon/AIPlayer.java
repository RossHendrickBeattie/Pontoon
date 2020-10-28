/**
 * @author  Ross Hendrick-Bettie
 * @version 3.0
 * @since   2020-10-28
 */


package Pontoon;

public class AIPlayer extends Player
{
    public AIPlayer()
    {
        mName = "Dealer";
    }

    @Override
    public void takeTurn() 
    {
        this.drawCard();
        this.drawCard();

        while (this.mHandTotal < 16)
        {
            this.drawCard();
        }
    }

    @Override
    public void drawCard() 
    {
        Card newCard = (Logic.gameDeck.dealCard());
        mHand.add(newCard);
        this.updateHandTotal();

    }
    
}
