package restassuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String getFirstName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return("Seema" + generatedString);
	}
	
	public static String getLastName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return("Jain" + generatedString);
	}
	
	public static String getUserName() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return("seema.jain" + generatedString);
	}
	
	public static String getPassword() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return("seema@123" + generatedString);
	}
	
	public static String getEmail() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return("seema@gmail.com" + generatedString);
	}
	
	public static String EmpSal() {
		String generatedString = RandomStringUtils.randomNumeric(5);
		return(generatedString);
	}
	
	public static String EmpAge() {
		String generatedString = RandomStringUtils.randomNumeric(2);
		return(generatedString);
	}


}
