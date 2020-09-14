package Week1;
import java.util.Scanner;

class tutorial1c{
static public void main (String args[]) {
    final Scanner kboard = new Scanner(System.in);

        int houseNumber = 0;
        String choice = "";
        int card1 = 0;
        int card2 = 0;
        int newCard = 0;
        int total = 0;

        houseNumber = getHouseNumber();

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

        
        if (getResult(total, houseNumber))
            {
                System.out.println("You have Won!");
                System.out.println("You had " + total);
                System.out.println("The House had " + houseNumber);
            }
        else
            {
                System.out.println("You have Lost!");
                System.out.println("You had " + total);
                System.out.println("The House had " + houseNumber);
            }

        kboard.close();

    }

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


    static int getRandomNumber()
    {
        return (int) Math.ceil(Math.random() * 10);
    }

    static int calcTotal(int x, int y)
    {
        int newTotal = x + y;
        return newTotal;
    }

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
