package models;

import org.junit.Test;

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
        int expect_deck_count_one = 51;
        String expect_card_one = "KC";
        int expect_deck_count_two = 50;
        String expect_card_two = "QC";

        // Received
        int received_deck_count_one, received_deck_count_two;
        Card received_card_one, received_card_two;

        // Act
        deck.Make();
        received_card_one = deck.Deal();
        received_deck_count_one = deck.getCount();

        received_card_two = deck.Deal();
        received_deck_count_two = deck.getCount();

        // Assert
        assertEquals(expect_card_one, received_card_one.getCode());
        assertEquals(expect_deck_count_one, received_deck_count_one);

        assertEquals(expect_card_two, received_card_two.getCode());
        assertEquals(expect_deck_count_two, received_deck_count_two);

    }



}
