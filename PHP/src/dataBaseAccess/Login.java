package dataBaseAccess;

public class Login
{
	// Global Constants for UserName, Password and Database Name
	
	public static String USRN = "phpadmin";
	public static String USRP = "phpadminpw";
	public static String Database = "dp2pharm"; 
	
	public static void updateCredentials(String UserName, String UserPw)
		{
			USRN = UserName;
			USRP = UserPw;
		}
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	/*
	 * 
	 *				1. Creates a new user on the database
	 *				2. Changes existing user privileges (change operator to Manager or Base)
	 *				3. Changes existing user credentials (new password)
	 *				4. Removes an existing user from the System.
	 * 
	 * 
	 *////////////////////////////////////////////////////////////////////////////
//1	
	public void UserCreate()
		{
			System.out.println("UserCreate Not Implemented");
		}
//2	
	public void UserEdit()
		{
			System.out.println("UserEdit Not Implemented");
		}
//3	
	public void UserNewPW()
		{
			System.out.println("UserNewPW Not Implemented");
		}
//4	
	public void UserDelete()
	{
		System.out.println("UserDelete Not Implemented");
	}
}

