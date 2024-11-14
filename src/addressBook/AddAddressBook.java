package addressBook;

public class AddAddressBook extends Contacts
{
	
	void addBook(String bookName, Contacts contacts)
	{
		if(super.books.get(bookName) == null)
		{
			books.put(bookName, contacts);
			System.out.println("Address Book " + bookName + " is added.");
		}else
		{
			System.out.println("Address Book " + bookName + " is already there !!!, please take some other name ..");
		}
	}
}
