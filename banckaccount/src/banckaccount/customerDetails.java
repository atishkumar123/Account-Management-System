package banckaccount;
import java.util.*;

public class customerDetails {
	Scanner sc=new Scanner(System.in);
	private String name;
	private String mobileno;
	private String emailid;
	private String userId;
	private String password;
	
	public  void account()
	{
		System.out.println("***IF YOU HAVE AN ACCOUNT THEN ENTER YES ELSE ENTER NO***");
		String option= sc.next();
		
		
		if(option.equalsIgnoreCase("YES")) 
		{	
            login();
		}
		if(option.equalsIgnoreCase("NO"))
		{
           detail();
           createUserid();
		  // login();
		}
		
		
	}
	
	private void detail()
	{
		System.out.println("***for creating an account please enter some details***");
		System.out.println("enter your name:-");
		String name1=sc.next();
		
		System.out.println("enter your mobileno:-");
		String mobileno1=sc.next();
		
		this.name=name1;
		this.mobileno=mobileno1;
		
	}
	private void createUserid() 
	{
		System.out.println("now create a userId with password" );
		
		System.out.println("enter userid:- ");	
		String userId1=sc.next();
		
		System.out.println("enter password:-");
		String password1=sc.next();
		
		this.userId=userId1;
		this.password=password1;
	}
	public  void login()
	{
		System.out.println("***LOGIN IN TO YOUR ACCOUNT***");
		
		System.out.println("enter your usserId:-");
		String c_userId=sc.next();
		
		System.out.println("enter your password:-");
		String c_password=sc.next();
		
		if( this.userId.equals(c_userId)&&this.password.equals(c_password))
		{
			System.out.println("HI\n"+name);
		}else
		{
			System.out.println("INVALID USERID & PASSWORD");
		}
	}
	
	
	
	
	
	
}
