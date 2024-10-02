package se.kanisha.dicegame;

import java.util.Random;
import java.util.Scanner;


public class Main
{  //Class Starts


   public static int totalScoreA;  // These are the declared within the class as class level variables.
   public static int totalScoreB;



public static void main(String[] args)
{  //Method Starts

    Scanner scannerA = new Scanner(System.in);
    System.out.println("Player A, Enter your name");
    PlayerInfo playerNameA = new PlayerInfo(scannerA.nextLine());
    System.out.println("Player B, Enter your name");
    PlayerInfo playerNameB = new PlayerInfo(scannerA.nextLine());


    rollDice();
    declareWinner(playerNameA.getPlayerName(), playerNameB.getPlayerName());

    scannerA.close();
}



public static void rollDice()
{
    Random random = new Random();
    totalScoreA = random.nextInt(6) + 1 + random.nextInt(6) + 1;
    totalScoreB = random.nextInt(6) + 1 + random.nextInt(6) + 1;

}



public static void declareWinner(String playerA, String playerB)
{
    if (totalScoreA > totalScoreB) {
        System.out.println("\n" + playerA + "wins!" + playerA + "'s Total score is: " + totalScoreA);
        System.out.println("\n" + playerB + "loses!" + playerB + "'s Total score is: " + totalScoreB);
    } else if (totalScoreB > totalScoreA) {
        System.out.println("\n" + playerB + " wins! " + playerB + "'s Total score is: " + totalScoreB);
        System.out.println("\n" + playerA + " loses! " + playerA + "'s Total score is: " + totalScoreA);
    } else {
        System.out.println("\n" + "Its a tie! Both " + playerA + " and " + playerB + " have equal score: " + totalScoreA);

    }
}


} // Main class  closes.








