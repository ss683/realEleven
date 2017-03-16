package com.company;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		Card one = new Card("Three", "Hearts", 3);
        Card two = new Card("Jack", "Diamonds", 11);
        Card three = new Card("Ace", "Spades", 1);
    }
}
