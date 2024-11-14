package strings;

import java.util.HashMap;

public class StringAnagram 
{
	public static void main(String[] args) 
	{
		String str1 = "silent";
		String str2 = "listen";
		
		System.out.println("These Strings are anagram : " + checkAnagram(str1,str2));
		
	}
	
	static boolean checkAnagram(String str1,String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}else
		{
			HashMap<Character,Integer> chars1 = new HashMap<>();
			HashMap<Character,Integer> chars2 = new HashMap<>();
			
			for(int i=0;i<str1.length();i++)
			{
				if(chars1.get(str1.charAt(i)) == null)
				{
					chars1.put(str1.charAt(i),1);
				}else
				{
					int count = chars1.get(str1.charAt(i));
					chars1.put(str1.charAt(i), ++count);
				}
				
				if(chars2.get(str2.charAt(i)) == null)
				{
					chars2.put(str2.charAt(i),1);
				}else
				{
					int count = chars2.get(str2.charAt(i));
					chars2.put(str2.charAt(i), ++count);
				}
				
			}
			if(chars1.equals(chars2))
			{
				return true;
			}else
			{
				return false;
			}
		}
	}
}
