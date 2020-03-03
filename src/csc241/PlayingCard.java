package csc241;

public class PlayingCard implements Comparable<PlayingCard>{

    // Instance variables
    private Suit suit;  // Crd suit -- hearts, clubs, etc.
    private Value value; // Card value -- 2 3, Jack, etc.

    // Constructor
    public PlayingCard(Value value , Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    // "Get" methods
    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    // Method required by Comparable interface
    @Override
    public int compareTo(PlayingCard other) {
        // Compare values
        int valueComapare = this.value.compareTo(other.getValue());
        if (valueComapare != 0) {
            // Values differ -- return the difference
            return valueComapare;
        }

        // If we've gotten to this point, the values must be the same
        // Return the difference in suits
        return this.suit.compareTo(other.getSuit());
    }
}
