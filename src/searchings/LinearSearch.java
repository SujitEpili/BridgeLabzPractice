package searchings;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int[] arr = {64, 25, 12, 22, 11};
        int target = 22;
        
        int index = linearSearch(arr, target);
        
        if (index != -1) 
        {
            System.out.println(target + " found at index " + index);
        } else 
        {
            System.out.println(target + " not found in the array");
        }
	}
	
	public static int linearSearch(int[] arr, int target) 
	{
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target) 
            {
                return i;
            }
        }
        return -1;
    }

}
