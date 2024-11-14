package operators;

import java.util.Scanner;

public class CheckEquality 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 Strings : ");
		String s1 = sc.next();
		String s2 = sc.next();
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}else
		{
			System.out.println("Strings are not equal");
		}
	}

}
