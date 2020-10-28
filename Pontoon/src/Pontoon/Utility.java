/**
 * @author  Ross Hendrick-Bettie
 * @version 2.0
 * @since   2020-10-28
 */

package Pontoon;

import java.util.Scanner;

/**
 * Scanners here so that there should only be one instance of the scanner running.
 */
public class Utility 
{
    private static Scanner kboard = new Scanner(System.in);

    /**

     * @return  The string entered by the user
     */
    public static String getStringInput() 
    {
        String returnLine = "";

        while (returnLine == "" | returnLine.equals(null)) 
        {
            returnLine = kboard.nextLine();
        }

        return returnLine;
    }

    /**
     * 
     * @return the next integer entered by the user
     */
    public static int getIntInput()
    {
        int returnValue;

        returnValue = kboard.nextInt();
        kboard.nextLine();

        return returnValue;

    }

    public static void CloseScanner()
    {
        kboard.close();
    }
    
}
