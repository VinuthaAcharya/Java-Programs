package ClassAssignments;
//Encapsulation Program
class AuthenticationGTM
{
	private String username="contact@grotechminds.com";
	private String password="123";
	
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
}

public class LoginGTM {

	public static void main(String[] args) 
	{
		AuthenticationGTM a=new AuthenticationGTM();
		a.setUsername("vinuthad70@gmail.com");
		System.out.println(a.getUsername());
		a.setPassword("456789");
		System.out.println(a.getPassword());
	}

}
