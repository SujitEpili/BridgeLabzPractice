package operators;

import java.util.Scanner;

public class MaxOf3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 numbers : ");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a + " is greater");
		}else if(b>c)
		{
			System.out.println(b + " is greater");
		}else
		{
			System.out.println(c + " is greater");
		}
		
	}

}
