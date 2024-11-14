package addressBook ;

import java.util.Scanner;

public class AddContact 
{
	private String firstName;
    private String lastName;
    //private String bookName;
    private String email;
    private long phNumber;
    private String address;
    private String city;
    private String state;
    private int zip;

    public AddContact(Contacts contacts,String bookName)
    {
        contactDetails();
        String userName = firstName + lastName;
        userName = userName.trim();
        Contacts newContact = new Contacts(firstName, lastName, bookName, email, phNumber, address, city, state, zip);
        contacts.addUser(userName, newContact);
        new AddressBookMain().whatToDo();
    }

    private void contactDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstName = sc.next();
        System.out.print("Enter your last name: ");
        lastName = sc.next();
        System.out.print("Enter your email: ");
        email = sc.next();
        System.out.print("Enter your phone number: ");
        phNumber = sc.nextLong();
        System.out.print("Enter your address: ");
        address = sc.next();
        System.out.print("Enter your city: ");
        city = sc.next();
        System.out.print("Enter your state: ");
        state = sc.next();
        System.out.print("Enter your zip: ");
        zip = sc.nextInt();
    }
}


