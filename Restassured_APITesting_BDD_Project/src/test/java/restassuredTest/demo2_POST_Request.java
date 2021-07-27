package restassuredTest;

import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import io.restassured.RestAssured;

public class demo2_POST_Request {
	
	public static  HashMap map = new HashMap();
	
	@BeforeClass
	public void postdata() 
	{
		map.put("FirstName", RestUtils.getFirstName());
		map.put("LastName", RestUtils.getLastName());
		map.put("UserName", RestUtils.getUserName());
		map.put("Paswword", RestUtils.getPassword());
		map.put("EmailID", RestUtils.getEmail());
		
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RestAssured.basePath = "/register";
	}
	
	@Test
	public void testdata() 
	{
		given()
			.contentType("application/json")
			.body(map)
			
		.when()
			.post()
			
		.then()
			.statusCode(201);
			// .body("SuccessCode",equalTo("OPERATION_SUCCESS"))
		// 	.and()
			// .body("Message",equalTo("Operation completed successfully"));
		
		
	}

}
