package data_structure;

public class CountTimeComplexity 
{
	public static void main(String[] args) 
	{
//		int[] nums = {5,7,9,11,13};
		int[] nums = new int[1000];
		int target = 11;
		
		int result1 = linearSearch(nums, target);
		int result2 = binarySearch(nums, target);
		if(result1 == -1)
		{
			System.out.println("Element not found !!!");
		}else
		{
			System.out.println("Element found at Index " + result1);
		}
		if(result2 == -1)
		{
			System.out.println("Element not found !!!");
		}else
		{
			System.out.println("Element found at Index " + result1);
		}
	}
	
	static int linearSearch(int[] nums, int target)
	{
		int steps = 0;
		for(int i=0;i<nums.length;i++)
		{
			steps++;
			if(nums[i] == target)
			{
				return i;
			}
		}
		System.out.println("Steps taken by linear search " + steps);
		
		return -1;
	}
	
	static int binarySearch(int[] nums, int target)
	{
		int left = 0;
		int steps = 0;
		int right = nums.length-1;
		while(left <= right)
		{
			steps++;
			int mid = (left+right)/2;
			if(nums[mid] == target)
			{
				return mid;
			}else if(target < nums[mid])
			{
				right = mid-1;
			}else if(target > nums[mid])
			{
				left = mid+1;
			}
		}
		System.out.println("Steps taken by binary search " + steps);
		
		return -1;
	}

}
