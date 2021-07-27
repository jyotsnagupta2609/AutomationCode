package IntializeBrowser;

public class StringReverse {
	
	public static void main(String[] args)
	{
		String input="Jyotsna";
		StringBuffer sb = new StringBuffer();
		for(int i=input.length()-1;i>=0;i--)
		{
			sb.append(input.charAt(i));
		}
		System.out.println("Output: "+sb.toString());
	}

}
