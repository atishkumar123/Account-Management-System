package banckaccount;

import java.util.*;

public class Customer {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String mobileNo;
	private String emailId;
	private String userId;
	private String password;

	public void register() {
		System.out.println("***IF YOU HAVE AN ACCOUNT THEN ENTER YES ELSE ENTER NO***");
		String option = sc.next();

		if (option.equalsIgnoreCase("YES")) {
			userlogin();
		}
		if (option.equalsIgnoreCase("NO")) {
			customerDetails();
			createUserid();
		}

	}

	private void customerDetails() {
		System.out.println("***For creating a new account please enter some details***");
		System.out.println("Enter your name:-");
		String name = sc.next();

		System.out.println("Enter your mobileno:-");
		String mobileNo = sc.next();

		System.out.println("Enter your email Id :-");
		String emailId = sc.next();
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;

	}

	private void createUserid() {
		System.out.println("***Now create a userId with password***");

		System.out.println("Enter userid:- ");
		String userId = sc.next();

		System.out.println("Enter password:-");
		String password = sc.next();

		this.userId = userId;
		this.password = password;
	}

	public void userlogin() {
		System.out.println("***LOGIN IN TO YOUR ACCOUNT***");
		int t = 0;
		do {

			System.out.println("Enter your usserId");
			String L_userId = sc.next();

			System.out.println("Enter your password");
			String L_password = sc.next();


			if (this.userId.equals(L_userId) && this.password.equals(L_password)) {
				System.out.println("HI\n" + name);
			} else {
				System.out.println("--INVALID USERID & PASSWORD--");
			}

		} while (++t< 3);

		System.out.println("***Sorry, you have exceeded the maximum logon attempts***");
	}

}
