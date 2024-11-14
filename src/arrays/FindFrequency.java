package arrays;

import java.util.HashMap;

public class FindFrequency
{
	public static void main(String[] args) 
	{
		int arr[] = {12,42,92,12,34,53,12,42};
		HashMap<Integer,Integer> numbers = new HashMap<>();
		
		for(int i:arr)
		{
			if(numbers.get(i)==null)
			{
				numbers.put(i,1);
			}else
			{
				int count = numbers.get(i);
				numbers.put(i,++count);
			}
		}
		
		System.out.println(numbers);
	}

}
