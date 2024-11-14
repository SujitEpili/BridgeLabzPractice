package operators;

import java.util.Scanner;

public class CheckDivisible
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");// If a number is divisible by both 5 and 7,
											  // then it must also be divisible by the least common
											  // multiple (LCM) of 5 and 7, which is 35.
		int n = sc.nextInt();
		if(n % 35 ==0)
		{
			System.out.println(n +" is divisible by both 5 and 7.");
		}else
		{
			System.out.println(n +" is not divisible by both 5 and 7.");
		}
		sc.close();
	}

}
