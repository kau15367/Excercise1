package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 *
 * @author Komalpreet Kaur 
 * Jan 31, 2024 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        

        hand[0] = new Card("Hearts",1);
        hand[1] = new Card("Diamonds",2);
        hand[2] = new Card("Spades",3);
        hand[3] = new Card("Clubs",4);
        hand[4] = new Card("Jack",5);
        hand[5] = new Card("Queen",6);
        hand[6] = new Card("King",7);
        
        System.out.println("enter your guess");
        Scanner input = new Scanner(System.in);
        System.out.println("enter your value between 1 to 13");
        int userValue = input.nextInt();
        System.out.println("enter your suit.");
        String userSuit = input.next();
        
        for (int i = 0; i < hand.length; i++) {
            if (userValue == hand[i].getValue() && userSuit.equals(hand[i].getSuit())) {
                System.out.println("Congratulations! Your got  the right card.");
                printInfo();
                break; // Exit the loop since we found a match
            }
            else if (userValue != hand[i].getValue() && userSuit.equals(hand[i].getSuit())) {
        System.out.println("Sorry, your guess did not match any card in the hand.");
    }
        }
    }
    private static  void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        
        
    
    }

}
