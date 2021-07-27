package Program;


public class ReverseString {

	public static void main(String args[]) {
		String reverse="", str="Heady";
		
		int length= str.length();
		System.out.println(length);
		
		for(int i=length-1; i>=0; i--)
			reverse=reverse+str.charAt(i);
		System.out.println(reverse);
		
	}
}
