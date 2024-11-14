package logicalPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctCouponNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many  coupons you want to add : ");
		int n =sc.nextInt();
		
		HashSet<Integer> couponNumbers = new HashSet<>();
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter a coupon number : ");
			int num = sc.nextInt();
			couponNumbers.add(num);
		}
		System.out.println("The distinct coupon numbers are : " + couponNumbers);
	}
	
	

}
