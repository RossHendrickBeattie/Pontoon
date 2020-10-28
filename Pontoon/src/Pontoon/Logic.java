/**
 * @author  Ross Hendrick-Bettie
 * @version 3.0
 * @since   2020-10-28
 */


package Pontoon;

import java.util.ArrayList;

public class Logic 
{
    private static AIPlayer dealer;
    private static ArrayList<Player> playerHost;
    static Deck gameDeck;

    /**
     * @param NoOfPlayers Number of human players in the game
     * 
     *                    To-Do change NoOfPlayers to two separate integers, in
     *                    order to implement AI players
     */
    public static void newGame() {
        playerHost = new ArrayList<Player>();
        
        dealer = new AIPlayer();
        playerHost.add(dealer);
        //ask for number of players

        System.out.println("How many people are playing? (1-6)");
        int humanPlayers = Utility.getIntInput();

        for (int i = 0; i < humanPlayers; i++)
        {
            System.out.println("Please enter a name");
            String newPlayerName = Utility.getStringInput();
            Player tempPlayer = new HumanPlayer(newPlayerName);
            playerHost.add(tempPlayer);  
        }
    }
    
    /**
     * Plays a round of Blackjack 
     * Separeted so that multiple rounds may be played with the same group of player,
     * though this functionality is not yet implemented
     */
    public static void playRound()
    {
        gameDeck = new Deck();

        for (Player currentPlayer : playerHost) 
        {
            currentPlayer.takeTurn();
        }
    }

    public static void endRound()
    {
        Player winner = dealer;

        for (Player player : playerHost) 
        {
            if (player.getHandTotal() <= 21)
            {
                if (player.getHandTotal() > winner.getHandTotal())
                {
                    winner = player;
                }
            }
        }

        System.out.println("The winner is " + winner.getName());
    }


}
