package addressBook;

import java.util.HashMap;

public class Contacts 
{
    protected static HashMap<String, Contacts> users = new HashMap<>();
    protected static HashMap<String, Contacts> books = new HashMap<>();
    
    private String bookName ;
	private String firstName;
    private String lastName;
    private String email;
    private long phNumber;
    private String address;
    private String city;
    private String state;
    private int zip;

    public Contacts()
    {
        
    }

    public Contacts(String firstName, String lastName,String bookName, String email, long phNumber, String address, String city,
                    String state, int zip) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookName = bookName;
        this.email = email;
        this.phNumber = phNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void addUser(String userName, Contacts contactInfo) 
    {
        if(users.containsKey(userName))
        {
            System.out.println("The user " + userName + " already exists!!!");
        } else 
        {
            users.put(userName, contactInfo);
            System.out.println("User " + userName + " added successfully.");
        }
        new AddressBookMain().whatToDo();
    }
    

    public void printContacts(String bookName) 
    {
        if (users.isEmpty()) 
        {
            System.out.println("No contacts available.");
        } else 
        {
            users.forEach((userName, contact) -> {  // It calls forEach method of HashMap named users(lambda expr)
            										// it is used to perform an action for each entry in map
            	boolean isEmpty =true;
            	if(bookName.equals(contact.bookName))
            	{
            		isEmpty = false;
            		System.out.println("\nName: " + userName);   
                    System.out.println("Address Book Name : "+ contact.bookName);
                    System.out.println("Email: " + contact.email);
                    System.out.println("Phone Number: " + contact.phNumber);
                    System.out.println("Address: " + contact.address);
                    System.out.println("City: " + contact.city);
                    System.out.println("State: " + contact.state);
                    System.out.println("ZIP: " + contact.zip);
                    System.out.println("---------------------------------");
            	}
            	if(isEmpty == true)
            	{
            		System.out.println("Address Book " + bookName + " doesn't have any contacts...");
            	}
            });
        }
    }

    public HashMap<String, Contacts> getUsers() {
		return users;
	}

	public void setUsers(HashMap<String, Contacts> users) {
		this.users = users;
	}
	
    public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getUserName() 
    {
        return firstName + " " + lastName;
    }
	
	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;	
		
	}

	public long getPhNumber() 
	{
		return phNumber;
	}

	public void setPhNumber(long phNumber) 
	{
		this.phNumber = phNumber;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public int getZip() 
	{
		return zip;
	}

	public void setZip(int zip) 
	{
		this.zip = zip;
	}
    
    
    
}
