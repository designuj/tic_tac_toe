package pl.designuj.play.tictactoe;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import pl.designuj.play.tictactoe.controllers.GameController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TictactoeIntegrationTests {

    @Autowired
    GameController gameController;

    @LocalServerPort
    private int port;

    @Before
    public void setUp() {
        RestAssured.port = port;
    }

    @Test
    public void testCreateGameWithRest() {
//        List board = put("/game/new?confirm=true").as(List.class, ObjectMapperType.GSON);
//        List<Map<Integer, Character>> game = (List<Map<String, String>>) JSON.deserializeUntyped(JsonString);
//        Map<Integer, Character> boards = (Map<Integer, Character>) game.get(0);
//        <Map<Integer, Character>> gameList = game.readValue(userDataJSON, new TypeReference<List<Map<Integer, Character>>>() {});
//        ObjectMapper mapper
//
//        given()
//                .pathParam("confirm", true)
//        .when()
//                .put("/game/new?confirm=true")
//        .then()
//                .extract()
//                .as(List.class);

        String board = "[{0= , 1= , 2= , 3= , 4= , 5= , 6= , 7= , 8= }, {0= , 1= , 2= , 3= , 4= , 5= , 6= , 7= , 8= }, {0= , 1= , 2= , 3= , 4= , 5= , 6= , 7= , 8= }, {0= , 1= , 2= , 3= , 4= , 5= , 6= , 7= , 8= }, {0= , 1= , 2= , 3= , 4= , 5= , 6= , 7= , 8= }, {0= , 1= , 2= , 3= , 4= , 5= , 6= , 7= , 8= }, {0= , 1= , 2= , 3= , 4= , 5= , 6= , 7= , 8= }, {0= , 1= , 2= , 3= , 4= , 5= , 6= , 7= , 8= }, {0= , 1= , 2= , 3= , 4= , 5= , 6= , 7= , 8= }]";


        //
        Map[] output =
                given()
                    .put("/game/new?confirm=true")
                .then()
                    .assertThat()
                        .statusCode(200)
                    .extract()
                    .as(Map[].class);


        System.out.println(Arrays.toString(output));

        assertEquals(board, output.toString());
    }

    @Test
    public void testMoveWithRest() {
        String output =
                given()
                    .put("/game/new?confirm=true")
                .then()
                    .assertThat()
                    .statusCode(200)
                    .extract()
                    .asString();


//        output = output.substring(1, output.length()-1);
//        String[] boardsArray = output.split(", ");
//        Map<String,String> map = new HashMap<>();
//
//        for(String pair : boardsArray)
//        {
//            String[] entry = pair.split("=");
//            map.put(entry[0].trim(), entry[1].trim());
//        }
    }
}
