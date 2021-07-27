package Program;

public class Pyramid3 {
	public static void printTriagle(int n) 
    { 
        // outer loop to handle number of rows 
        for (int i=0; i<n; i++) 
        { 
              // inner loop to handle number spaces, values changing acc. to requirement 
            for (int j=n-i; j>1; j--) 
            { 
                System.out.print(" "); // printing spaces
            } 
   
            //  inner loop to handle number of columns, values changing acc. to outer loop 
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print("* "); // printing stars 
            } 
   
            System.out.println();  // ending line after each row 
        } 
    } 
	public static void main(String[] args) {
		int n =5;
		printTriagle(n);
	}
}
