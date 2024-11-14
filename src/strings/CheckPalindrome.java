package strings;

public class CheckPalindrome 
{
	public static void main(String[] args) 
	{
		String str = "madam";
		String revStr = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			revStr += str.charAt(i);
		}
		
		if(str.equals(revStr))
		{
			System.out.println("The String " + str + " is Palindrome.");
		}else
		{
			System.out.println("The String " + str + " is not Palindrome.");
		}
	}

}
