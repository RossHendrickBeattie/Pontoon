/**
 * @author  Ross Hendrick-Bettie
 * @version 3.0
 * @since   2020-10-28
 */


package Pontoon;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Logic.newGame();
        Logic.playRound();
        Logic.endRound();

        Utility.CloseScanner();
    }
}
