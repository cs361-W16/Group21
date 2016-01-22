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
        received = deck.getRemain();

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
        received_deck_count = deck.getRemain();
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
        String expect_card_one = "AD";
        int expect_deck_count_two = 50;
        String expect_card_two = "2D";

        // Received
        int received_deck_count_one, received_deck_count_two;
        Card received_card_one, received_card_two;

        // Act
        deck.Make();
        received_card_one = deck.Deal();
        received_deck_count_one = deck.getRemain();

        received_card_two = deck.Deal();
        received_deck_count_two = deck.getRemain();

        // Assert
        assertEquals(expect_card_one, received_card_one.getCode());
        assertEquals(expect_deck_count_one, received_deck_count_one);

        assertEquals(expect_card_two, received_card_two.getCode());
        assertEquals(expect_deck_count_two, received_deck_count_two);

    }

    @Test
    public void testDeckClassMake(){
        Deck deck = new Deck();
        deck.Make();
        assertEquals(52, deck.getRemain());
    }

    @Test
    public void testDeckClassDealAll(){

        // Arrange
        Deck deck = new Deck();

        // Expect
        int expect_deck_count = 0;
        String expect_card = "KC";

        // Received
        int received_deck_count;
        Card received_card;

        // Act
        deck.Make();
        // Deal all cards but one
        while(deck.getRemain() != 1){
            deck.Deal();
        }

        received_card = deck.Deal();
        received_deck_count = deck.getRemain();

        // Assert
        assertEquals(expect_card, received_card.getCode());
        assertEquals(expect_deck_count, received_deck_count);

    }
    @Test
    public void testDeckClassUsedCount(){

        // Arrange
        Deck deck = new Deck();

        // Expected
        int expected_used_count = 0;

        // Received
        int received_used_count;

        // Act
        deck.Make();
        // TODO: Need to add a deal

        received_used_count = deck.getUsed();

        // Assert

        assertEquals(expected_used_count, received_used_count);

    }

    @Test
    public void testDeckClassRemainCount(){

        // Arrange
        Deck deck = new Deck();

        // Expected
        int expected_used_count = 52;

        // Received
        int received_used_count;

        // Act
        deck.Make();
        // TODO: Need to add a deal

        received_used_count = deck.getRemain();

        // Assert

        assertEquals(expected_used_count, received_used_count);

    }



}
