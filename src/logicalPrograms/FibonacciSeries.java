package logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number you want to print : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		if(n==1)
		{
			System.out.print(a);
		}
		else if (n>=2)
		{
			System.out.print(a + " " + b);
			for(int i=0;i<n-2;i++)
			{
				int c = a + b ;
				System.out.print(" "+c);
				a=b;
				b=c;
			}
		}
	}

}
