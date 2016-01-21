package models;

import org.junit.Test;
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
}
