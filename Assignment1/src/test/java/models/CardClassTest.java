package models;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by nathan on 1/19/16.
 */
public class CardClassTest {

    @Test
    public void testCardClassValue(){

        // Arrange
        Card[] cards;
        char[] values = {'A','2','3','4','5','6','7','8','9', 'T', 'J', 'Q', 'K'};
        char[] received = new char[13];

        // Act

        // Create cards
        cards = buildCards(13);

        // Setting cards values
        for(int i = 0; i < values.length; i++){
            cards[i].setValue(values[i]);
        }

        // Receiving values from cards
        for(int i = 0; i < values.length; i++){
            received[i] = cards[i].getValue();
        }

        // Assert
        assertArrayEquals(values, received);

    }

    @Test
    public void testCardClassSuit(){

        // Arrange
        Card[] cards;
        char[] suit = {'S','C','H','D'};
        char[] received = new char[4];

        // Act

        // Create cards
        cards = buildCards(4);

        // Setting cards values
        for(int i = 0; i < suit.length; i++){
            cards[i].setSuit(suit[i]);
        }

        // Receiving values from cards
        for(int i = 0; i < suit.length; i++){
            received[i] = cards[i].getSuit();
        }

        // Assert
        assertArrayEquals(suit, received);

    }

    public Card[] buildCards(int count){
        Card[] cards = new Card[count];
        for(int i = 0; i < cards.length; i++){
            cards[i] = new Card();
        }
        return cards;
    };

}

