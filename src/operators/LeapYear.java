package operators;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int y = sc.nextInt();
		boolean isLeapY =false;
		if(y % 4==0)
		{
			isLeapY=true;
			if(y % 100==0)
			{
				isLeapY=false;
				if(y % 400==0)
				{
					isLeapY=true;
				}
			}
		}
		if(isLeapY)
		{
			System.out.println(y + " is a leap year");
		}else
		{
			System.out.println(y + " is not a leap year");
		}
	}

}
