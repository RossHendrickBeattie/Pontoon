package Week1;
import java.util.Scanner;

class tutorial1a{
static public void main (String args[]) {
    final Scanner kboard = new Scanner(System.in);

        String choice = "";
        int card1 = 0;
        int card2 = 0;
        int newCard = 0;
        int total = 0;

        card1 = (int) Math.ceil(Math.random() * 10);
        card2 = (int) Math.ceil(Math.random() * 10);
        total = card1 + card2;

        System.out.println("You have drawn " + card1 + " and " + card2);
        System.out.println("Your total is " + total);
        System.out.println("Do you want to draw another card (y/n)?");

        choice = kboard.nextLine();

        while (choice.equals("y")) {
            newCard = (int) Math.ceil(Math.random()*10);
            total = total + newCard;

            System.out.println("You have drawn " + card1);
            System.out.println("Your total is " + total);
            System.out.println("Do you want to draw another card (y/n)?");

            choice = kboard.nextLine();
        }

        
        if (total > 18 && total<=21)
            {
                System.out.println("You have Won!");
            }
        else
            {
                System.out.println("You have Lost!");
            }

        kboard.close();

    }
}
