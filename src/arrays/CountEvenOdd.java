package arrays;

import java.util.Scanner;

public class CountEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int [] arr = {13,42,123,342,53,98,200};
		int even = 0,odd = 0;
		for(int i:arr)
		{
			if(i%2 ==0) even++;
			else odd++;
		}
		
		System.out.println("In this array there are "+even+" even numbers and "+odd+" odd numbes are present");
	}

}
