package models;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by nathan on 1/19/16.
 */
public class CardClassTest {

    @Test
    public void testCardClassSetValue(){

        // Arrange
        Card c = new Card();
        char received = ' ';

        // Act
        c.setValue('K');
        received = c.getValue();

        // Assert
        assertSame('K', received);


    }

}

