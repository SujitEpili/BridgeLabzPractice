package operators;

import java.util.Scanner;

public class CalculateAverage 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 numbers : ");
		int a =sc.nextInt();
		a +=sc.nextInt();
		a +=sc.nextInt();
		a +=sc.nextInt();
		a +=sc.nextInt();
		
		float avg = a/5f;
		
		System.out.println("The average of these number is : "+ avg);
	}

}
