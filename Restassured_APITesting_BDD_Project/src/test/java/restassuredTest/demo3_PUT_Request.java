package restassuredTest;

import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;


public class demo3_PUT_Request {
	
	public static HashMap map = new HashMap();
	
	String empName = RestUtils.getFirstName();
	String empSal = RestUtils.EmpSal();
	String empAge = RestUtils.EmpAge();
	int empID = 11501;
	
	@BeforeClass
	public void putData() {
		
		map.put("name", empName);
		map.put("salary", empSal);
		map.put("age", empAge);
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/update/"+empID;
	}
	
	@Test
	public void testPut()
	{
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.put()
		.then()
			.statusCode(200)
			.log().all();
	}

}
