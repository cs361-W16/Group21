package models;

/**
 * Created by nathan on 1/19/16.
 */
public class Card {

    private char value;
    private char suit;

    public void setValue(char v) {
        value = v;
    }

    public char getValue() {
        return value;
    }

    public void setSuit(char s) {
        suit = s;

    }

    public char getSuit(){
        return suit;
    }
}
