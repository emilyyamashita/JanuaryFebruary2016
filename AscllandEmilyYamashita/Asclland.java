
/**
 * A game that moves a marker from a starting location through a series of calls to an ending location
 * Board has 41 cells
 * Two players, A and B; both players start on START cell; A always goes first
 * Move forward # of spaces rolled, except backwards if 4 or 6
 * If player lands on space of another, moves to start
 * 
 * @author (Emily Yamashita) 
 * @version (02/01/2016)
 */

import java.util.*;
public class Asclland
{
    // instance variables - replace the example below with your own
    private int playerOneLocation = 0;
    private int playerTwoLocation = 0;

    void moveMarker()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the moves");
        String bothPlayersMoves = input.nextLine(); //stores input as a String

        boolean gameOn = true;
        while (gameOn == true)
        {
            for (int j = 0; j <= bothPlayersMoves.length(); j += 2)
            //All the characters at the odd indices of the string will be commas, which are irrelevant
            {
                if (j % 4 == 0) //#s at indices multiples of 4 represent playerOnes moves
                {
                    if (bothPlayersMoves.charAt(j) != '4' && bothPlayersMoves.charAt(j) != '6')
                    {
                        playerOneLocation += Integer.valueOf(bothPlayersMoves.substring(j,j+1));
                    }
                    else //move backwards if rolled a 4 or 6
                    {
                        playerOneLocation -= Integer.valueOf(bothPlayersMoves.substring(j,j+1));
                    }
                    
                    if (playerOneLocation == playerTwoLocation) //moves to start if occupying another players square
                    {
                        playerTwoLocation = 0;
                    }
                    if (playerOneLocation < 0) //makes sure location isn't negative
                    {
                        playerOneLocation = 0;
                    }
                    if (playerOneLocation >= 40) //breaks loop because a player won
                    {
                        gameOn = false;
                    }
                }
                else //repeats for playerTwo
                {
                    if (bothPlayersMoves.charAt(j) != '4' && bothPlayersMoves.charAt(j) != '6')
                    {
                        
                        playerTwoLocation += Integer.valueOf(bothPlayersMoves.substring(j,j+1));
                    }
                    else 
                    {
                        playerTwoLocation -= Integer.valueOf(bothPlayersMoves.substring(j,j+1));
                    }
                    if (playerTwoLocation == playerOneLocation) //moves to start if occupying another players square
                    {
                        playerOneLocation = 0;
                    }
                    if (playerTwoLocation < 0)
                    {
                        playerTwoLocation = 0;
                    }
                    if (playerTwoLocation >= 40)
                    {
                        gameOn = false;
                    }
                    
                }
            }
            gameOn = false;
        }
    }

    void printOutput()
    {
        if (playerOneLocation > 0 && playerOneLocation < 40)
        {
            System.out.print("A-" + playerOneLocation);
        }
        else if (playerOneLocation == 0)
        {
            System.out.print("A-START");
        }
        else
        {
            System.out.print("A-END");
        }

        if (playerTwoLocation > 0 && playerTwoLocation < 40)
        {
            System.out.println(", B-" + playerTwoLocation);
        }
        else if (playerTwoLocation == 0)
        {
            System.out.println(", B-START");
        }
        else
        {
            System.out.println(", B-END");
        }

    }

}
