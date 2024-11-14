package logicalPrograms;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int revNum = 0;
		
		int temp = n ;
		while(temp!=0)
		{
			revNum = revNum*10 + (temp%10) ;
			temp /= 10;
		}
		
		System.out.println("Reverse of "+ n +" is : "+ revNum);
	}

}
