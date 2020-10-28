/**
 * @author  Ross Hendrick-Bettie
 * @version 1.0
 * @since   2020-10-28
 */


package Pontoon;

public class HumanPlayer extends Player 
{
    private String mName;

    public HumanPlayer(String name)
    {
        mName = name;
    }


    @Override
    public void takeTurn() {
        System.out.println("\nIt is now " + mName + "'s turn");
        
        this.drawCard();
        this.drawCard();

        //while hand total <21, ask if player wants to draw another card
        while (this.mHandTotal < 21)
        {
            //System.out.println("\n");
            System.out.println("Your total is " + mHandTotal);
            System.out.println("Would you like to draw another card? (y/n)");
            if (Utility.getStringInput().equalsIgnoreCase("y"))
            {
                this.drawCard();
                
            }
            else
            {
                break;
            }
        }
        if (this.mHandTotal > 21)
        {
            System.out.println("You have gone bust!");
        }

    }

    @Override
    public void drawCard() {
        Card newCard = (Logic.gameDeck.dealCard());
        System.out.println("You have drawn the " + newCard.getCardName());

        mHand.add(newCard);
        this.updateHandTotal();
    }

    public void showHand()
    {
        System.out.println(mName + "'s hand:");

        for (Card card : mHand) 
        {
            System.out.println(card.getCardName());
        }
    }
    
}
