package arrays;

import java.util.Arrays;

public class FindMinMax 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,54,43,9,32};
		int min = arr[0];
		int max = arr[0];
		
		for(int i:arr)
		{
			if(i<min) min = i;
			else if(i>max) max = i;
		}
		
		int[] revArr = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			revArr[i] = arr[arr.length-1-i];
		}
	 
		System.out.println("The minimun number in this array is : "+ min +" and maximum is : "+ max);
		System.out.println("The reverse of this array is : "+ Arrays.toString(revArr));
	}

}
