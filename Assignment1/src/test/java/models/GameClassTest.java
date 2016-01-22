package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Devin on 1/21/2016.
 *
 * **INCOMPLETE**
 *  Merging so that Terrance has a copy of the game class
 *
 */
public class GameClassTest {

    @Test
    public void testGameColumnOne() {
        //Arrange
        Game game = new Game();
        int expectedInitialValue = 0;

        //act
        int receivedValue = game.columnInitialized();

        //Assert
        assertEquals(expectedInitialValue, receivedValue);
    }

    @Test
    public void testAllGameColumns() {
        //Arrange
        Game game = new Game();
        int expected = 0;                   //The expected value

        //Act
        int recievedColumnTwo = game.columnInitialized();
    }

}
