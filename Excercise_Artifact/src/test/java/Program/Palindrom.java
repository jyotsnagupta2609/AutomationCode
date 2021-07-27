package Program;

public class Palindrom { 
	
    static boolean isPalindrome(String str) 
    { 
         // Pointers pointing to the beginning 
        // and the end of the string 
        int i = 0, j = str.length() - 1; 
        System.out.println("J length is: " + j); 
       
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 

            i++; 
            j--; 
        } 
  
        // Given string is a palindrome 
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "sam"; 
  
        if (isPalindrome(str)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 
