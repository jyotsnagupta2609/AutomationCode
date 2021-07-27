package Program;

public class Pyramid1 {
	public static void printStar(int n) {
		int i, j;
		for(i=0;i<n;i++)  // outer loop to handle number of rows 
		{
			for(j=0;j<=i;j++)  //  inner loop to handle number of columns
			{
				System.out.print("* ");
			}
			System.out.println();  // ending line after each row 
		}
	}

	public static void main(String[] args) {
			int n=5;
			printStar(n);
	}

}
