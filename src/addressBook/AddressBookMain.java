package addressBook;

import java.util.Scanner;

public class AddressBookMain 
{
	private static Contacts contacts = new Contacts();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Hello, Welcome to Address Book System");
        try
        {
        	new AddressBookMain().whatToDo();
        }catch(Exception e)
        {
        	e.printStackTrace();
        	new AddressBookMain().whatToDo();
        }
        
    }

    void whatToDo()
    {
    	while(true)
    	{
    		System.out.print("\nWhat you want to do ? \nPress \n1 For create a new Address Book "
    				+ "\n2 For update or view contacts Address Book \n3 For see the Address Books : ");
    		int choice = sc.nextInt();
    		String bookName ;
    		if(choice == 1)
    		{
    			System.out.print("Enter a name for your Address Book : ");
    			bookName = sc.next();
    			new AddAddressBook().addBook(bookName, contacts);
    		}else if(choice == 2)
    		{
    			System.out.print("Enter your Address Book Name : ");
    			bookName = sc.next();
    			if(contacts.books.get(bookName) == null)
    			{
    				System.out.println("\nNo such Address Book found with name : " + bookName);
    			}else
    			{
    				System.out.println("\nHii, Welcome to " + bookName);
    				System.out.println("Press \n1 to add a Person \n2 to see Contacts  \n3 to edit Contacts ");
            		System.out.print("4 to delete a person \n5 to Exit :");
                    int n = sc.nextInt();
                    if (n == 1) 
                    {
                        new AddContact(contacts,bookName);
                    } else if (n == 2) 
                    {
                        contacts.printContacts(bookName);
                    }else if(n == 3)
                    {
                    	System.out.print("Enter username : ");
                		String userName = sc.next();
                    	new EditContact().editUser(userName,new Contacts().users);
                    }else if(n == 4)
                    {
                    	System.out.print("Enter username : ");
                		String userName = sc.next();
                    	new DeletePerson().deleteUser(userName,new Contacts().users);
                    }else if(n == 5)
                    {
                    	System.out.println("Thanks...");
                    	return ;
                    }
                    else 
                    {
                        System.out.println("Invalid option. Please try again.");
                    }
    			}   			
    		}else if(choice == 3)
    		{
    			if(contacts.books.isEmpty())
    			{
    				System.out.println("\n There are no books present inside !!!");
    			}else
    			{
        			System.out.println(contacts.books.keySet());
    			}
    		}else
    		{
    			System.out.println("Invalid option !!!");
    		}
    			

    	}
          
    }
}
