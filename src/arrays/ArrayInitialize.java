package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitialize 
{
	public static void main(String[] args) 
	{
		System.out.print("How mant numbers you want to take in array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter a number : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0 ;
		for(int i:arr) 
			sum+= i;
		float avg = (float)sum/arr.length;
		
		System.out.println("The elements of array are : "+ Arrays.toString(arr));
		System.out.println("Sum of these numbers is : "+ sum);
		System.out.println("And average of these number is : "+ avg);
	}

}
