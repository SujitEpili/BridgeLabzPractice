package searchings;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 4, 5, 6, 9};
        int target = 5;
        
        int index = binarySearch(arr, target);
        
        if (index != -1) 
        {
            System.out.println(target + " found at index " + index);
        } else 
        {
            System.out.println(target + " not found");
        }
	}
	
	static int binarySearch(int[] arr, int target)
	{
		int left = 0;
        int right = arr.length - 1;
        
        while(left <= right)
        {
        	int mid = (left + right )/2;
        	if(arr[mid] == target)
        	{
        		return mid;
        	}
        	if(arr[mid] < target)
        	{
        		left = mid + 1;
        	}else
        	{
        		 right = mid - 1;
        	}
        }
        return -1;
	}

}
