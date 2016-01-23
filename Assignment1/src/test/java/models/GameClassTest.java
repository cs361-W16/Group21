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

        int expected = 0; //Expected value

        //act
        int received = game.columnInitialized();

        //Assert
        assertEquals(expected, received);
    }

    @Test
    public void testBottom() {
        //Arrange
        Game game = new Game();
        int expected = 0;
        int bottomOne, bottomTwo, bottomThree, bottomFour;

        //Act
        bottomOne = game.getBottom(0);                      //Gets the bottom for one
        bottomTwo = game.getBottom(1);
        bottomThree = game.getBottom(2);
        bottomFour = game.getBottom(3);

        //Assert
        assertEquals(expected, bottomOne);
        assertEquals(expected, bottomTwo);
        assertEquals(expected, bottomThree);
        assertEquals(expected, bottomFour);

    }

    //Test Delete of card from game
    @Test
    public void testDeletecard() {
        //Arrange
        Game game = new Game();
        int beforeDelete;
        int afterDelete;

        //deleting the card
        game.Deal();
        beforeDelete = game.getBottom(3);
        game.Delete(3);
        afterDelete = game.getBottom(3);

        //checking deletion
        assertNotEquals(beforeDelete, afterDelete);

    }
}
