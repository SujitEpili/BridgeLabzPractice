package strings;

import java.util.HashSet;

public class LongestSubString
{
	public static void main(String[] args) 
	{
//		String str = "sujitkumarepili";
//		
//		int max=0;
//		String longestSubStr = "";
////		HashSet<Character> chars = new HashSet<>();
//	int a[]=new int[26];
//	
//	int count=0;
//		int j=0;
//		for(int i=0;i<str.length();i++)
//		{
//			
//			if(a[str.charAt(i)-'a']==1) {
//				
//				max=Math.max(max,count);
//				//System.out.println(i+"ghgjgjhgjg");
//				//System.out.println(i+".."+(str.charAt(i)-'a')+"+");
//				while(str.charAt(j)!=str.charAt(i)) {
//					a[str.charAt(j)-'a']=0;
//					count--;
//			j++;}
//				a[str.charAt(j)-'a']=1;
//				//count--;
//			//	System.out.println(count);
//			//a[str.charAt(i)-'a']=1;
//			//max=Math.max(max,count);
//		//	System.out.println(max);
//			//count=1;
//			j++;
//			}
//			else {
//				count++;
//				a[str.charAt(i)-'a']+=1;
//			}
//			
//		}
//		max=Math.max(max,count);
//		System.out.println(max);
		
		String str = "geekforgeeks";
		
		int max =0,i,j=0;
		
		for(i=0;i<str.length();i++)
			
		{
			HashSet<Character> chars = new HashSet<>();
			for(j=i;j<str.length();j++)
			{
				if(chars.contains(str.charAt(j)))
				{
					System.out.println(chars);
					max=Math.max(max,j-i);
					System.out.println(max);
					break;
				}else
				{
					chars.add(str.charAt(j));
				}
			}
			
		}
//		if(flag==0)
//		
		max=Math.max(max,j-i-1);	
		System.out.println(max);
	
		
		
			
	}

}
