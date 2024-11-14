package operators;

public class Pre_Post_Increment 
{
	public static void main(String[] args) 
	{
		int a = 12;
		int b = 12;
		System.out.println("This is value of pre-increment :"+ ++a);
		// in pre-increment operation the value first update with +1 and then will used
		System.out.println("a :"+ a);
		System.out.println("This is value of post-increment :"+ b++);
		// in post-increment operation the value first used and then it will update with +1
		System.out.println("b :"+ b);
		
		// This same concept is also for pre-decrement and post-decrement
	}

}
