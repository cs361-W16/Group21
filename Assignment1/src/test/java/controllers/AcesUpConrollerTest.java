package controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import ninja.NinjaTest;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by nathan on 1/22/16.
 */
public class AcesUpConrollerTest extends NinjaTest {

    String URL_DELETE_CARD = "/deleteCard";
    String URL_DEAL_CARD = "/dealCard";

    @Test
    public void testPOSTDeleteCard(){
        String id = "col-one";

        String response = ninjaTestBrowser.postJson("http://localhost:8080" + URL_DELETE_CARD,id);

        try {
            String resultString = new ObjectMapper().readValue(response, String.class);
            assertEquals("col-one",resultString);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testPOSTDealCard(){
        String id = "col-one";

        String response = ninjaTestBrowser.postJson("http://localhost:8080" + URL_DELETE_CARD,id);

        try {
            String resultString = new ObjectMapper().readValue(response, String.class);
            assertEquals("col-one",resultString);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
