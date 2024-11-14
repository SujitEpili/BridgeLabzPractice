package operators;

import java.util.Scanner;

public class AddAndSub 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The sum of two numbers is : "+ (a+b));
		System.out.println("The difference between these two numbers is : "+Math.abs(a-b));
	}

}
