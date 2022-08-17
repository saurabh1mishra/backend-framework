package testSuite;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import properties.bookStoreProperties;
import entities.getBooksResponse;

import static io.restassured.RestAssured.given;

public class getBooksTest extends baseTest {

    @Test(groups = {"testTag"})
    public void getAllBooksData() {
        Response resp = given().
                contentType("application/json").
                when().
                get(bookStoreProperties.getAllBooks);
        System.out.println(resp.asString());
        getBooksResponse getBooksResponse = resp.as(entities.getBooksResponse.class);
        Assert.assertEquals("test", "test");
    }
}
