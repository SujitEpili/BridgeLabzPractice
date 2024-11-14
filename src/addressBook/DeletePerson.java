package addressBook;

import java.util.HashMap;

public class DeletePerson extends Contacts
{
	void deleteUser(String userName,HashMap users)
	{
		if(super.users.get(userName) != null)
		{
			users.remove(userName);
			System.out.println(userName + " deleted.");
		}else
		{
			System.out.println("User not found !!!");
		}
	}
}
