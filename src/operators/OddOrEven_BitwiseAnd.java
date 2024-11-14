package operators;

import java.util.Scanner;

public class OddOrEven_BitwiseAnd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if((n & 1) ==0)
		{
			System.out.println(n + " is an even number.");
		}else
		{
			System.out.println(n + " is an odd number.");
		}
	}

}
