package addressBook;

import java.util.HashMap;
import java.util.Scanner;

public class EditContact extends Contacts
{
	Scanner sc = new Scanner(System.in);
	
	
	public void editUser(String userName,HashMap users)
    {
		Contacts contact = super.users.get(userName);
		userName = userName.trim();
		System.out.println("User name : "+ userName);
		users = super.users;
		System.out.println(users);
    	if(super.users.get(userName) != null)
    	{
    		
    		System.out.println("What u want to edit : Press ");
    		System.out.print(" 1 : Email \n 2 : Phone Number \n 3 : Address \n ");
    		System.out.print("4 : City \n 5 : State \n 6 : Zip \n 7 : to Exit");
    		int choice = sc.nextInt();
    		System.out.print("Enter your new value : ");
    		switch(choice)
    		{
    			case 1 :
    				String newMail = sc.next();
    				contact.setEmail(newMail);
    				super.users.put(userName, contact);
    				break;
    			case 2 :
    				Long phNumber = sc.nextLong();
    				contact.setPhNumber(phNumber);
    				super.users.put(userName, contact);
    				break;
    			case 3 :
    				String address = sc.next();
    				contact.setEmail(address);
    				super.users.put(userName, contact);
    				break;
    			case 4 :
    				String city = sc.next();
    				contact.setCity(city);
    				super.users.put(userName, contact);
    				break;
    			case 5 :
    				String state = sc.next();
    				contact.setState(state);
    				super.users.put(userName, contact);
    				break;
    			case 6 :
    				int zip = sc.nextInt();
    				contact.setZip(zip);
    				super.users.put(userName, contact);
    				break;
    			case 7 :
    				return ;
    			default :
    				System.out.print("Invalid input !!! \nEnter a valid property which you want to change :");
    				new AddressBookMain().whatToDo();
    		}
    		System.out.println("Detail changed successfully.");
    	}else
    	{
    		System.out.println("User not found .");
    	}
    }
}
