

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class postmanTest {
    @Test
    public void shouldTestPostResponse(){

        given()
                .baseUri("https://postman-echo.com")
                .body("new value")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .log().body()
                .and().body("data",hasLength(9))
                .and().body("data",equalTo("newvalue"))
        ;
    }
}
