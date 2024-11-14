package operators;

import java.util.Scanner;

public class BitwiseOperators
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first integer : ");
		int a = sc.nextInt();
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();
		System.out.println("The bitwise AND result is : "+(a & b));
		System.out.println("The bitwise OR result is : "+(a | b));
		System.out.println("The bitwise XOR result is : "+(a ^ b));
	}

}
