//Pontoon
//Version 4         14/09/2020
//Created by:   Ross Hendrick-Beattie

import java.util.Scanner;
import java.util.ArrayList;

class tutorial1d{
static public void main (String args[]) {
    final Scanner kboard = new Scanner(System.in);

        int houseNumber = 0;
        String choice = "";
        ArrayList<Integer> PlayerHand = new ArrayList<Integer>();
        int handTotal = 0;
                                                        //Generates the house's hand value
        houseNumber = getHouseNumber();
                                                        //Sets up the players intial hand
        PlayerHand.add(getRandomNumber());
        PlayerHand.add(getRandomNumber());
        handTotal = calcHandTotal(PlayerHand);
                                                        //Informs the player of their hand's value
        System.out.println("You have drawn " + PlayerHand.get(0) + " and " + PlayerHand.get(1));
        System.out.println("Your total is " + handTotal);

                                                        //Asks if the player want to draw anothe card
        System.out.println("Do you want to draw another card (y/n)?");
        choice = kboard.nextLine();

        while (choice.equals("y")) {
                                                        //Generate a new card and add it to the player's hand
            PlayerHand.add(getRandomNumber());
            handTotal = calcHandTotal(PlayerHand);

            System.out.println("You have drawn " + PlayerHand.get(PlayerHand.size()-1));
            System.out.println("Your total is " + handTotal);

                                                        //Check if the total of the player's hand is over 21
                                                        // if not they may draw another card
            if (busted(handTotal))
                {
                    System.out.println("Busted! Your hand has a value over 21");
                    choice = "n";
                }
            else
                {
                    System.out.println("Do you want to draw another card (y/n)?");
                    choice = kboard.nextLine();
                }

            
        }

                                                        //If Player's hand is worth more than the house's
                                                        //but is not over 21 OR if the player's hand is
                                                        //not over 21 and the House's is, they have won
        if (getResult(handTotal, houseNumber))
            {
                System.out.println("You have Won!");
                                                        //Could be removed to a function
                System.out.println("You had " + handTotal);
                System.out.print("You hand was: ");
                for (int i = 0; i < PlayerHand.size(); i++)
                {
                    System.out.print(PlayerHand.get(i)+ " ");
                }
                System.out.println();
                System.out.println("The House had " + houseNumber);
            }
        else
            {
                System.out.println("You have Lost!");
                System.out.println("You had " + handTotal);
                System.out.print("You hand was: ");
                for (int i = 0; i < PlayerHand.size(); i++)
                {
                    System.out.print(PlayerHand.get(i)+ " ");
                }
                System.out.println();
                System.out.println("The House had " + houseNumber);
            }

        kboard.close();

    }
                                                    //Generates the house's hand using the same method
                                                    //that the player's does, having a minimum value
                                                    //of 17
    static int getHouseNumber()
    {
        int number = 0;
        number = getRandomNumber();
        number = + number + getRandomNumber();

        while (number < 17)
        {
            number = + number + getRandomNumber();
        }
        return number;
    }

                                                    //Generates a random number between 1 and 10
    static int getRandomNumber()
    {
        return (int) Math.ceil(Math.random() * 10);
    }
                                                    //Calculates the total value of the player's hand
    static int calcHandTotal(ArrayList<Integer> hand)
    {
        int total = 0;

        for (int i = 0; i < hand.size(); i++)
        {
            total = total + hand.get(i);
        }

        return total;
    }

                                                    //Works out who has won the game
    static boolean getResult(int z, int house)
    {
        if (z > house && z <= 21)
            {
                return true;
            }
        else if (house > 21 && z <= 21)
            {
                return true;
            }
        else
            {
                return false;
            }
    }
                                                    // Check if the player's hand has a total over 21
    static boolean busted(int z)
    {
        if (z > 21)
            {
                return true;
            }
        else
            {
                return false;
            }
    }

}
