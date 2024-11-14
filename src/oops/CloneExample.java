package oops;

class CloneClass implements Cloneable
{
	String name ;
	int age;
	
	CloneClass(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public void display()
	{
		System.out.println("Name : " + name + ", Age : " + age);
	}
}

public class CloneExample
{	
	public static void main(String[] args)
	{
		try
		{
			CloneClass person1 = new CloneClass("Ram",16);
			CloneClass person2 = (CloneClass) person1.clone();
			
			person1.display();
			person2.display();
			
			person2.name = "Kartik";
			person2.age = 21;
			person2.display();
			
		}catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
	}	
}
