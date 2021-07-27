package Program;

public class ReverseString2 {
	 
	public static void main(String[] args) {
  
		String myStr = "Guru99";
  		
		String reversed = reverseString(myStr); //create Method and pass and input parameter string 
		System.out.println("The reversed string is: " + reversed);
		}
 	public static String reverseString(String myStr) //Method take string parameter and check string is empty or not
	{
		if (myStr.isEmpty()){ 
		 System.out.println("String in now Empty");	
		 return myStr;
		}
		//Calling Function Recursively
		System.out.println("String to be passed in Recursive Function: "+myStr.substring(1));
		return reverseString(myStr.substring(1)) + myStr.charAt(0);
	}
 
}
