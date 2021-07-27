package Program;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomProgram {

	public static void main(String args[]) throws Exception {
		   String s1 = "Hello";
		   String s2 = new String(s1);
		   String s3 = "Hello";
		 
		   System.out.println(s1 + " equals " + s2 + "--> " +  s1.equals(s2)); //true
		 
		   System.out.println(s1 + " == " + s2 + " --> " + (s1 == s2)); //false
		   System.out.println(s1 + " == " + s3 + " -->" + (s1 == s3)); //true
		 }
}
