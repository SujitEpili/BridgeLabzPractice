package strings;

import java.util.HashMap;

public class CountCharacter 
{
	public static void main(String[] args) 
	{
		String str = "apple";
		
		HashMap<Character,Integer> chars = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(chars.get(str.charAt(i)) == null)
			{
				chars.put(str.charAt(i), 1);
			}else
			{
				int count = chars.get(str.charAt(i));
				chars.put(str.charAt(i), ++count);
			}
		}
		
		System.out.println(chars);
	}

}
