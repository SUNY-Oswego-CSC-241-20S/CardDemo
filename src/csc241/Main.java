package csc241;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Create some cards
        PlayingCard pc1 = new PlayingCard(Value.FIVE, Suit.SPADES); // Use the enumerator values as parameters
        PlayingCard pc2 = new PlayingCard(Value.EIGHT, Suit.DIAMONDS);
        PlayingCard pc3 = new PlayingCard(Value.EIGHT, Suit.CLUBS);

        // Compare them -- note the sign of the returned value
        System.out.println("C1->C2: " + pc1.compareTo(pc2)); // FIVE is before EIGHT
        System.out.println("C2->C3: " + pc2.compareTo(pc3)); // Same values, but DIAMONDS are before CLUBS
        System.out.println("C3->C1: " + pc3.compareTo(pc1)); // EIGHT follows FIVE

    }
}
