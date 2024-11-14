package logicalPrograms;

import java.util.Scanner;

public class PrimeNumebr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		boolean isPrime=true;
		
		for(int i=2;i<=(n/2);i++)
		{
			if(n%i ==0)
			{
				isPrime = false;
			}
		}
		
		if(isPrime == true && n != 1)
		{
			System.out.println(n + " is a prime number ");
		}else
		{
			System.out.println(n + " is not a prime number ");
		}
	}

}
