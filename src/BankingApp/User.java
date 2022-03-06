package BankingApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class User {
	Scanner scan = null;
	public String firstname;
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}




	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String lastName;
	public int phoneNumber;
	public String userName;
	public String password;
	
	public User() {
		
	}
	
	public void signUp() {
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Type First Name:");
			while(scan.hasNext()) {
				this.firstname = scan.next();
				System.out.println("Type Last Name:");
				this.lastName = scan.next();
				System.out.println("Type Phone Name:");
				this.phoneNumber = scan.nextInt();
				System.out.println("Type a User Name:");
				this.userName = scan.next();
				System.out.println("Type Password :");
				this.password =scan.next();
			}
			System.out.println("Congrats you have signed up. your username is " +this.userName + " " + "\nYour Password is: " +this.password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(scan!=null) {
				scan.close();
			}
		}
		
		
	}

	public void Login() throws FileNotFoundException {
	    scan = new Scanner (new File("the\\dir\\myFile.extension"));
	    Scanner keyboard = new Scanner (System.in);
	    System.out.println("To Login please enter your User Name: ");
	    String newUserName = scan.nextLine();
	    this.userName = newUserName; // Will be checking with the if look
	    System.out.println("Enter your Password: ");
	    String newPassword = scan.nextLine(); // looks at selected file in scan
	    this.password = newPassword;
	    //Check the credentials now
	    String inpUser = keyboard.nextLine();
	    String inpPass = keyboard.nextLine(); // gets input from user

	    if (inpUser.equals(this.userName) && inpPass.equals(this.password)) {
	        System.out.print("your login message");
	    } else {
	        System.out.print("your error message");
	    }

	}
}
