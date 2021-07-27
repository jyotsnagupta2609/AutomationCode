package restassuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class demo1_GET_Request {
	
	@Test
	public void getWeatherDetails() {
		
		given()
		.when()
		.get("http://restapi.demoqa.com/utilities/weather/Hyderabad")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.header("Content-Type","application/json");
	}

}
