package models;

/**
 * Created by nathan on 1/19/16.
 */


public class Deck {
    private static int NUM_SIZE = 52;
    private static char[] CHAR_SUIT = {'D', 'H', 'S', 'C'};
    private static char[] CHAR_VALUE = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
    private Card cards[];

    public Deck() {
        cards = new Card[NUM_SIZE];
    }

    /**
     * Counts the number of cards used in the deck
     * @return int
     */
    public int getUsed(){
        int usedcount = 0;

        for(int i = (NUM_SIZE - 1) ; i >= 0; i--){
            if(cards[i] == null){
                usedcount++;
            }
        }

        return usedcount;
    }

    /**
     * Counts the number of cards left in the deck
     * @return int
     */
    public int getRemain(){
        int remaincount = 0;

        for(int i = (NUM_SIZE - 1); i >= 0; i--){
            if(cards[i] != null){
                remaincount++;
            }
        }
        return remaincount;
    }

    // For testing purposes
    public String getCard(int c) {
        return cards[c].getCode();
    }

    /**
     * Initializes the deck with 52 cards
     */
    public void Make() {
        int tempcount = 0;
        for (int s = 0; s < CHAR_SUIT.length; s++) {
            for (int v = 0; v < CHAR_VALUE.length; v++) {
                cards[tempcount] = new Card(CHAR_VALUE[v], CHAR_SUIT[s]);
                tempcount++;
            }
        }
    }

    /**
     * Deals the top card of the deck.
     *      Top = First
     * @return Card
     */
    public Card Deal() {
        int top;
        Card card;
        if(getRemain() != 0 && getUsed() != NUM_SIZE){
            top = getUsed();
            card = cards[top];
            cards[top] = null;
        }
        else{
            card = null;
        }
        return card;
    }


}
