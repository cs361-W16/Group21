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
        bottomOne = game.getBottom(0);                      //Gets the bottom for column one
        bottomTwo = game.getBottom(1);                      //Gets the bottom for column two
        bottomThree = game.getBottom(2);                    //Gets the bottom for column three
        bottomFour = game.getBottom(3);                     //Gets the bottom for column four

        //Assert
        assertEquals(expected, bottomOne);
        assertEquals(expected, bottomTwo);
        assertEquals(expected, bottomThree);
        assertEquals(expected, bottomFour);
    }

    @Test
    public void testDeal() {
        //Arrange
        Game game = new Game();
        int expected = 0;
        int bottomOne, bottomTwo, bottomThree, bottomFour;

        //Act


    }

    @Test
    public void testDealToBoard() {
        //Arrange
        Game game = new Game();
        int expected = 4;

        //Act
        int recieved = game.dealToBoard();

        //Assert
        assertEquals(expected, recieved);
    }

    @Test
    public void testReset() {
        //Arrange
        Game game = new Game();
        int expected_card_count = 4;
        int expected_card_count2 = 0;

        //Act
        int received_card_count = 0;
        int received_card_count2 = 52;

        received_card_count = game.dealToBoard();
        game.reset();
        received_card_count2 = game.getBottom(0) + game.getBottom(1) + game.getBottom(2) + game.getBottom(3);


        //Assert
        assertEquals(expected_card_count, received_card_count);
        assertEquals(expected_card_count2, received_card_count2);
    }
}