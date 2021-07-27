package Program;

public class Pyramid2 {
	 public static void printStars(int n) { 
	 int i, j; 
	  	    for(i=0; i<n; i++)   // outer loop to handle number of rows 
	        { 
	            for(j=2*(n-i); j>=0; j--)   // inner loop to handle number spaces, values changing acc. to requirement 
	            { 
	               System.out.print(" ");   // printing spaces 
	            } 
	            for(j=0; j<=i; j++)    //  inner loop to handle number of columns, values changing acc. to outer loop 
	            { 
	               System.out.print("* ");   // printing stars 
	            } 
	            System.out.println();  // ending line after each row 
	        } 
	    } 
	public static void main(String[] args) {
		int n=5;
		printStars(n);
	}

}
