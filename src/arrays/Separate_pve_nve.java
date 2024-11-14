package arrays;

import java.util.Arrays;

public class Separate_pve_nve 
{
	public static void main(String[] args) 
	{
		int arr[] = {56,32,-12,68,-25,-92,72};
		int positives = arr.length;
		for(int i:arr)
		{
			if(i<0) positives--;
		}
		int[] posArr = new int[positives];
		int[] negArr = new int[arr.length-positives];
		int p = 0,n = 0;
		for(int i:arr)
		{
			if(i<0)
			{
				negArr[n++]=i;
			}else
			{
				posArr[p++]=i;
			}
		}
		System.out.println("Elements of negative array are : "+Arrays.toString(negArr));
		System.out.println("Elements of postive array are : "+Arrays.toString(posArr));		
	}

}