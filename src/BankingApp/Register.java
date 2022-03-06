package BankingApp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Date;

public class Register extends Client {
	Scanner scan = null;
	public String firstName;
	public String lastName;
	private String userName = " ";
	private String userPassword = " ";
	public int employeeID;
	public  String userRole = "";
	//public String rolesTip= "Type 'A' for Admin, 'M' for Manager or 'C' for Client";
		
	public void selectRole() {
		try {
			System.out.println("");
			System.out.println("Welcome to AC Bank");
			System.out.println("===============================*****===============================");
			
			//Scanner for the user inputs
			Scanner scan = new Scanner(System.in);
			//Client Permanent option shower
			while(true){
				
				System.out.println("Please Type your Role..");
				System.out.println("");
				System.out.println("-Press 1 for Admin");
				System.out.println("");
				System.out.println("-Press 2 form Manager");
				System.out.println("");
				System.out.println("-Press 3 for Client");
				System.out.println("");
				System.out.println("-Press 4 for Exit");
				int n = scan.nextInt();
				
				switch (n) {
					
				case 1: 
							userRole = "Admin";
							System.out.println(" ");
							System.out.println("Admin SignUp Page");
							adminRegister();
							System.out.println(" ");
						break;
				case 2: 
							userRole = "Manager";
							System.out.println(" ");
							System.out.println("Manager SignUp Page");
							managerRegister();							
							System.out.println(" ");
						break;
				case 3:
							userRole = "Client";
							System.out.println(" ");
							System.out.println("Client signUp Page");
							clientRegister();
							System.out.println(" ");
						break;
				case 4:
							byeByeBye();
							System.out.println(" ");
						break;
				
				case 5:
					System.exit(0);
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + n);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}	
	}
	public void selectLoginRole() {
		System.out.println("User Role Page");
		System.out.println("===============================*****===============================");
		scan = new Scanner(System.in);
		
		try {
			System.out.println("");
			System.out.println("Welcome to AC Bank");
			System.out.println("===============================*****===============================");
			
			//Scanner for the user inputs
			Scanner scan = new Scanner(System.in);
			//Client Permanent option shower
			while(true){
				
				System.out.println("Please Type your Role..");
				System.out.println("");
				System.out.println("-Press 1 for Admin");
				System.out.println("");
				System.out.println("-Press 2 form Manager");
				System.out.println("");
				System.out.println("-Press 3 for Client");
				System.out.println("");
				System.out.println("-Press 4 for Welcome Page");
				System.out.println("");
				System.out.println("-Press 5 for Exit");
				int n = scan.nextInt();
				
				switch (n) {
					
				case 1: 
							userRole = "Admin";
							System.out.println(" ");
							System.out.println("Admin Login Page");
							adminLogin();
							System.out.println(" ");
						break;
				case 2: 
							userRole = "Manager";
							System.out.println(" ");
							System.out.println("Manager Login Page");
							managerLogin();							
							System.out.println(" ");
						break;
				case 3:
							userRole = "Client";
							System.out.println(" ");
							System.out.println("Client Login Page");
							clientLogin();
							System.out.println(" ");
						break;
				case 4:
							welcomePage();
							System.out.println(" ");
						break;
				case 5:
							byeByeBye();
							System.out.println(" ");
						break;
		
				case 6:
					System.exit(0);
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + n);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		scan = new Scanner(System.in);
		System.out.println("Please enter a User Name: ");
		try {
			userName = scan.nextLine();
			this.userName = userName;
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
	}

	public String getPassword() {
		return userPassword;
	}

	public void setPassword(String password) {
		scan = new Scanner(System.in);
		System.out.println("Please enter a Password: ");
		try {
			password = scan.nextLine();
			userPassword = password;
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
	}
	//Admin Registration Method
	public void adminRegister() {
		System.out.println("===============================*****===============================");
		//System.out.println("Client Login Registration Page ");
		scan = new Scanner(System.in);
		System.out.println("Enter your First Name:");
		String newFirstName = scan.nextLine();
		super.firstname = newFirstName;
		
		System.out.println("Enter Your Last Name:");
		String newLastName = scan.nextLine();
		this.lastName = newLastName;
		
		System.out.println("Enter Your Empployee ID:");
		int newEmpID = scan.nextInt();
		this.employeeID = newEmpID;
		
		System.out.println("Enter your User Name:");
		String uName = scan.next();
		this.userName = uName;
		
		System.out.println("Enter your Password:");
		String pass = scan.next();
		this.userPassword = pass;
		
		System.out.println(" ");
		System.out.println("Your Login information are below:");
		System.out.println("User Name : " + this.userName);
		System.out.println("Password : "+ this.userPassword);
		System.out.println("User Role : " + userRole);
		System.out.println("User Employee ID : " + this.employeeID);
		
		System.out.println("Congrats..you have successfully registered..Please Login now:");
		
		adminLogin();
	}
	
	//Manager Registration Method
	public void managerRegister() {
		System.out.println("===============================*****===============================");
		scan = new Scanner(System.in);
		System.out.println("Enter your First Name:");
		String newFirstName = scan.nextLine();
		super.firstname = newFirstName;
		
		System.out.println("Enter your Last Name:");
		String newLastName = scan.nextLine();
		super.lastName = newLastName;
	
		System.out.println("Enter your Employee ID :");
		int enteredEmployeeID = scan.nextInt();
		employeeID = enteredEmployeeID;
		
		System.out.println("Enter your User Name:");
		String newUserName = scan.nextLine();
		userName = newUserName;
		
		System.out.println("Enter your Password:");
		String newPassword = scan.nextLine();
		userPassword = newPassword;
		
		System.out.println(" ");
		System.out.println("Your Login information are below:");
		System.out.println("User Name : " + newUserName);
		System.out.println("Password : "+ newPassword);
		System.out.println("User role : " + userRole);
		
		System.out.println("Congrats..you have successfully registered..Please Login now:");
		
		managerLogin();	
			
	}
	//Client Registration Method
	public void clientRegister() {
		System.out.println("===============================*****===============================");
		//System.out.println("Client Login Registration Page ");
		scan = new Scanner(System.in);
		System.out.println("Enter your First Name:");
		String newFirstName = scan.nextLine();
		super.firstname = newFirstName;
		
		System.out.println("Enter Your Last Name:");
		String newLastName = scan.nextLine();
		this.lastName = newLastName;
		
		System.out.println("Enter your User Name:");
		String uName = scan.next();
		this.userName = uName;
		
		System.out.println("Enter your Password:");
		String pass = scan.next();
		this.userPassword = pass;
		
		System.out.println(" ");
		System.out.println("You user information are as below: ");
		System.out.println("===============================*****===============================");
		System.out.println("-User Name: " + userName );
		System.out.println("-Password : "+ userPassword);
		System.out.println("-Your role is: " + userRole);
		System.out.println(" ");
		System.out.println("Client Sigin Page: Signin Please:");
		clientLogin();	
	}
			
	//Customer Login
	public void clientLogin() {
		System.out.println("===============================*****===============================");
		System.out.println("Client Login Page ");
		scan = new Scanner(System.in);
		System.out.println("Enter your UserName:");
		String newUserName = scan.nextLine();
		
		System.out.println("Enter your password:");
		String newPassword = scan.nextLine();
		try {
			if(newUserName.equals(userName) && newPassword.equals(userPassword)) {
				System.out.println(" ");
				System.out.println("===============================*****===============================");
				System.out.println("you are logged : " + this.firstname + " " + this.lastName + " " + "\nUser Type: " +userRole);
				accountStatus();
				clientActivities();	
			}else {
				System.out.println("Invalid User Name or Password!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
	}
	private void accountStatus() {
		// TODO Auto-generated method stub
		if(isAccountApproved==true) {
			System.out.println("Account Details are below: ");
	       	System.out.println("===============================*****===============================");
		
			isAccountApprovedValue = "Active";
			System.out.println("Is a Joint Account :" + this.accountTypeValue);
			System.out.println("Account Owner's Full Name : " + super.firstname + " " + super.lastName);
			System.out.print("Account Number:");generateAccountNumber(); 
			System.out.println("\nAccount Type: " + this.accountNumber);
			System.out.println("Creation Date : " + getCurrentDate);
			System.out.println("Account Status: " + isAccountApprovedValue);
			System.out.println("===============================*****===============================");

		}else if(isAccountApproved == false){
			System.out.println("Account Still Pending");
		}
	}
	//Manager Login Method
	public void managerLogin() {
		System.out.println("");
		System.out.println("Manager Login Page ");
		System.out.println("===============================*****===============================");
		scan = new Scanner(System.in);
		System.out.println("Enter your UserName:");
		String newUserName = scan.nextLine();
		
		System.out.println("Please enter your password:");
		String newPassword = scan.nextLine();
		try {
			if(newUserName.equals(this.userName) && newPassword.equals(this.userPassword) ) {
				System.out.println(" ");
				System.out.println("===============================*****===============================");
				System.out.println("you are logged : " + this.firstName + " " + this.lastName + " " + "\nUser Type: " +userRole + " " + "\nEmplyee ID: " +employeeID);
				
			}else {
				System.out.println("Invalid User Name or Password!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
	}	
	//Admin Login Method
		public void adminLogin() {
			System.out.println("");
			System.out.println("Admin Login Page ");
			System.out.println("===============================*****===============================");
			System.out.println("");
			System.out.println("Enter your UserName:");
			scan = new Scanner(System.in);
			String newUserName = scan.nextLine();
			
			System.out.println("Please enter your password:");
			String newPassword = scan.nextLine();
			try {
				if(newUserName.equals(this.userName) && newPassword.equals(this.userPassword) ) {
					System.out.println(" ");
					System.out.println("===============================*****===============================");
					System.out.println("you are logged : " + this.firstName + " " + this.lastName + " " + "\nUser Type: " +userRole + " " + "\nEmplyee ID: " + employeeID);
					
					accountAprovedOrDenyPage();
				}else {
					System.out.println("Invalid User Name or Password!");
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.getStackTrace();
			}
			
		}
		public void clientActivities() {
			System.out.println(" ");
			System.out.println("Welcome to your Client Activities Page");
			System.out.println("===============================*****===============================");
			
			//Scanner for the user inputs
			Scanner scan = new Scanner(System.in);
			//Client Permanent option shower
			while(true){
				System.out.println("Please choose options below..");
				System.out.println("Choose 1 for Creating Account");
				System.out.println("Choose 2 for Deposit");
				System.out.println("Choose 3 for Withdraw");
				System.out.println("Choose 4 for Check Balance");
				System.out.println("Choose 5 for transfer");
				System.out.println("Choose 6 for LogOut");
				//System.out.println("Choose the operation what you desire to do");
				int n = scan.nextInt();
				
				switch (n) {
					
				case 1: 
							super.createBankAcount();
							System.out.println(" ");
						break;
				case 2: 
							super.deposit();
							System.out.println(" ");
						break;
				case 3:
							super.withdraw();
							System.out.println(" ");
						break;
				case 4:
							super.showAccount();
						break;
				case 5:
								super.transfer();
							System.out.println(" ");
						break;
				case 6:
							selectRole();
								System.out.println(" ");
						break;
				case 7:
					System.exit(0);
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + n);
				}
			}
		}
		public void welcomePage() {
			System.out.println("");
			System.out.println("Welcome to AC Bank");
			System.out.println("===============================*****===============================");
			
			//Scanner for the user inputs
			Scanner scan = new Scanner(System.in);
			//Client Permanent option shower
			while(true){
				
				System.out.println("Please choose options below..");
				System.out.println("");
				System.out.println("-Choose 1 to Login");
				System.out.println("");
				System.out.println("-Choose 2 to Get Register");
				System.out.println("");
				System.out.println("-Choose 3 for Exit");
				int n = scan.nextInt();
				
				switch (n) {
					
				case 1: 
							selectLoginRole();
							System.out.println(" ");
						break;
				case 2: 
							selectRole();
							System.out.println(" ");
						break;
				case 3:
							byeByeBye();
							System.out.println(" ");
						break;
				case 4:
					System.exit(0);
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + n);
				}
			}

		}
		public void byeByeBye() {
			System.out.println(" ");
			System.out.println("------------------------------------------------------>");
			System.out.println("Thank you for visiting AC Bank...See you next time");
			System.out.println("------------------------------------------------------>");	
			System.exit(0);
		}
		public void accountAprovedOrDenyPage() {
			System.out.println("");
			System.out.println("Welcome to AC Bank Account Final Status Page");
			System.out.println("===============================*****===============================");
			
			//Pending Account Application Details
			System.out.println("Account Details are below: ");
				       	System.out.println("===============================*****===============================");
					
						isAccountApprovedValue = "Pending..";
						System.out.println("Is a Joint Account :" + this.accountTypeValue);
						System.out.println("Account Owner's Full Name : " + super.firstname + " " + super.lastName);
						System.out.print("Account Number:");generateAccountNumber(); 
						System.out.println("\nAccount Type: " + this.getAccountName());
						System.out.println("Creation Date : " + getCurrentDate);
						System.out.println("Account Status: " + isAccountApprovedValue);
						System.out.println("===============================*****===============================");
					
			
			//Scanner for the user inputs
			Scanner scan = new Scanner(System.in);
			//Client Permanent option shower
			while(true){
				
				System.out.println("Please select the option below..");
				System.out.println("");
				System.out.println("-Press 1 to approve");
				System.out.println("");
				System.out.println("-Press 2 to Reject");
				System.out.println("");
				System.out.println("-Press 4 to LogOut");
				int n = scan.nextInt();
				
				switch (n) {
					
				case 1: 
							
							this.isAccountApproved=true;
							System.out.println(" ");
							System.out.println("Thank you!");
							
						break;
				case 2: 
							System.out.println("Thank you!");
							System.out.println(" ");
						break;
				case 3:
							userRole = "Client";
							System.out.println(" ");
							System.out.println("Client Login Page");
							clientLogin();
							System.out.println(" ");
						break;
				case 4:
							welcomePage();
							System.out.println(" ");
						break;
				case 5:
					System.exit(0);
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + n);
				}
			}

		}

}
