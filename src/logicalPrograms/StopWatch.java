package logicalPrograms;

import java.util.Scanner;
import java.time.*;

public class StopWatch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter something for start the timer :");
		sc.next();
		long startTime = System.currentTimeMillis();
		
		System.out.print("Enter something to stop the timer :");
		sc.next();
		long endTime = System.currentTimeMillis();
		
		double elapsedTime = (endTime - startTime)/1000d ;
		
		int minutes = 0 ;
		int hours = 0;
		if(elapsedTime >= 60)
		{
			minutes = (int) (elapsedTime/60);
			elapsedTime %= 60;
		}
		if(minutes >= 60)
		{
			hours = minutes/60;
			minutes %= 60;
		}
		
		System.out.println("The elapsed timing is  : " + hours + " hours "+
		minutes + " minutes and " + elapsedTime + " Seconds"
				);
		
	}

}
