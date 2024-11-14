package operators;

import java.util.Scanner;

public class CalcArea 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		int r = sc.nextInt();
		System.out.println("The area of this circle is : "+(4*3.141*r*r));
	}

}
