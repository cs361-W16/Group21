package models;

import org.junit.Test;
<<<<<<< HEAD

import static org.junit.Assert.*;

/**
 * Created by nathan on 1/19/16.
 */
public class DeckClassTest {

    @Test
    public void testDeckClassInitialization(){

        // Arrange
        Deck deck = new Deck();
        int expected = 0;
        int received;


        // Act
        received = deck.getCount();

        // Assert
        assertEquals(expected, received);


    }

    @Test
    public void testDeckClassMakeDeck(){

        // Arrange
        Deck deck = new Deck();

        // Expect
        int expect_deck_count = 52;
        String expect_card_first = "AD";
        String expect_card_last = "KC";

        // Received
        int received_deck_count;
        String received_card_first;
        String received_card_last;


        // Act
        deck.Make();
        received_deck_count = deck.getCount();
        received_card_first = deck.getCard(0);
        received_card_last = deck.getCard(51);

        // Assert
        assertEquals(expect_deck_count,received_deck_count);
        assertEquals(expect_card_first,received_card_first);
        assertEquals(expect_card_last,received_card_last);

    }

    @Test
    public void testDeckClassDeal(){

        // Arrange
        Deck deck = new Deck();

        // Expect
        int expect_deck_count = 51;

        // Received
        int received_deck_count;

        // Act
        deck.Make();
        deck.deal()

    }

=======
import static org.junit.Assert.assertEquals;

/**
 * Created by Devin on 1/20/2016.
 * Description: This is the DeckClassTest which just test the features of the deck class
 *
 */

public class DeckClassTest {
    @Test
    public void testDeckCountZero() {
        //Arrange
        Deck freshDeck = new Deck();

        //Assert
        assertEquals(0, freshDeck.getCount());
    }

    @Test
    public void testDeckCountOne() {
        //Arrange
        Deck freshDeck = new Deck();

        //Assert
        assertEquals(1, freshDeck.getCount());
    }
>>>>>>> cs361-W16/master
}
