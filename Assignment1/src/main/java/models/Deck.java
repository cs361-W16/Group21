package models;

/**
 * Created by nathan on 1/19/16.
 */


public class Deck {
    private static int NUM_SIZE = 52;
    private static char[] CHAR_SUIT = {'D', 'H', 'S', 'C'};
    private static char[] CHAR_VALUE = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
    private Card cards[];
    private int count;

    Deck() {
        cards = new Card[NUM_SIZE];
        count = 0;
    }

    public int getCount() {
        return count;
    }
    public String getCard(int c){
        return cards[c].getCode();
    }

    public void Make() {
        for (int s = 0; s < CHAR_SUIT.length; s++) {
            for (int v = 0; v < CHAR_VALUE.length; v++) {
                cards[count] = new Card(CHAR_VALUE[v], CHAR_SUIT[s]);
                count++;
            }
        }
    }


}
