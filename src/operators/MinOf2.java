package operators;

import java.util.Scanner;

public class MinOf2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min = (a<b ? a : b);
		
		System.out.println(min + " is smaller");
		
	}

}
