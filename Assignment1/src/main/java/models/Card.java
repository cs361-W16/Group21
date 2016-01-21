package models;


/**
 * Created by nathan on 1/19/16.
 */
public class Card {

    private char value;
    private char suit;

    Card(){
        value = '0';
        suit = '0';

    }
    Card(char v, char s){
        value = v;
        suit = s;
    }

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

    public String getCode(){
        return String.valueOf(value) + String.valueOf(suit);
    }
}
