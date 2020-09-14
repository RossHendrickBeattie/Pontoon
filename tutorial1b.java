package Week1;
import java.util.Scanner;

class tutorial1b{
static public void main (String args[]) {
    final Scanner kboard = new Scanner(System.in);

        String choice = "";
        int card1 = 0;
        int card2 = 0;
        int newCard = 0;
        int total = 0;

        card1 = getRandomNumber();
        card2 = getRandomNumber();
        total = calcTotal(card1, card2);

        System.out.println("You have drawn " + card1 + " and " + card2);
        System.out.println("Your total is " + total);
        System.out.println("Do you want to draw another card (y/n)?");

        choice = kboard.nextLine();

        while (choice.equals("y")) {
            newCard = getRandomNumber();
            total = calcTotal(total, newCard);

            System.out.println("You have drawn " + newCard);
            System.out.println("Your total is " + total);


            if (busted(total))
                {
                    choice = "n";
                }
            else
                {
                    System.out.println("Do you want to draw another card (y/n)?");
                    choice = kboard.nextLine();
                }

            
        }

        
        if (getResult(total))
            {
                System.out.println("You have Won!");
            }
        else
            {
                System.out.println("You have Lost!");
            }

        kboard.close();

    }

    static int getRandomNumber()
    {
        return (int) Math.ceil(Math.random() * 10);
    }

    static int calcTotal(int x, int y)
    {
        int newTotal = x + y;
        return newTotal;
    }

    static boolean getResult(int z)
    {
        if (z > 18 && z <= 21)
            {
                return true;
            }
        else
            {
                return false;
            }
    }

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
