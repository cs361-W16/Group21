package controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import models.Game;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.junit.Test;
import ninja.NinjaTest;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by nathan on 1/22/16.
 */
public class AcesUpConrollerTest extends NinjaTest {

    String URL_DELETE_CARD = "/deleteCard";
    String URL_DEAL_CARD = "/dealCard";
    String URL_INIT_GAME = "/initializeGame";

    @Test
    public void testPOSTDeleteCard(){

        // Arrange
        String id = "col-one";
        String response = ninjaTestBrowser.postJson("http://localhost:8080" + URL_DELETE_CARD,id);


        try {
            // Act
            String resultString = new ObjectMapper().readValue(response, String.class);

            // Assert
            assertEquals("col-one",resultString);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testGETInitializeGame(){

        // Arrange
        String response = ninjaTestBrowser.makeRequest("http://localhost:8080" + URL_INIT_GAME);

        try {

            // Act
            Game result_gamestate = new ObjectMapper().readValue(response, Game.class);

            // Assert
            assertNotEquals(null, result_gamestate);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void testPOSTDealCard(){
        // Arrange
        Game gamestate = new Game();
        gamestate.columnInitialized();
        gamestate.dealToBoard();

        String response = ninjaTestBrowser.makeRequest("http://localhost:8080" + URL_DEAL_CARD);

        try {

            // Act
            Game result_gamestate = new ObjectMapper().readValue(response, Game.class);

            // Assert
            assertNotEquals(gamestate, result_gamestate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
