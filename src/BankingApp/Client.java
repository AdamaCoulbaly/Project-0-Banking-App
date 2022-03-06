package BankingApp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Client extends User{
	
	private String fName;
	private String lName;
	private double balance;
	private String accountName;
	public String getAccountName() {
		return accountName;
	}
	double withdraw = 0.0;
	double deposit;
	char accountNumber;//Auto generated
	public boolean accountType;
	public String accountTypeValue = "No";
	public boolean isAccountApproved = false;
	public String isAccountApprovedValue;
	
	// Bring Current Date
	Date dayNow= new Date();
	SimpleDateFormat myDateFormat = new SimpleDateFormat("E MM.dd.yyy  'at' hh.mm.ss a zzzz");
	String getCurrentDate = myDateFormat.format(dayNow);
	
	
	Scanner scan = new Scanner(System.in);
	public String getFirstName() {
		return fName;
	}
	public String getLastName() {
		return lastName;
	}
	
	
	public Client() {
		balance = 0;
	}public double getBalance() {
		return balance;
	}
	
	//Scanner for retrieving the input of the client
		public void createBankAcount() {
			
			System.out.println(" ");
			System.out.println("Client Bank Account Creation Page ");
			System.out.println("===============================*****===============================");
			System.out.println("Select Account Name..\n-Press '1' for Saving Account  \n-Press '2' for Checkin Account");
			//System.out.println("Enter Acount Name:");
			try {
				while (scan.hasNext()) {
					//this.accountName = scan.next();
					int SelectedAccount = scan.nextInt();
					if(SelectedAccount==1) {
						this.accountName = "Saving Account";
					}else if(SelectedAccount==2) {
						this.accountName ="Checkin Account";
					}else {
						System.out.println("Invalid Selection..");
					}
					
					System.out.println("Enter Your First Name:");
					String fName = scan.next();
					super.firstname = fName;
					
					System.out.println("Enter Your Last Name:");
					String lName = scan.next();
					super.lastName = lName;
					
					System.out.println("Add initial found:");
					this.balance = scan.nextLong();
					
					System.out.print("Is this a Joint Account?  \nType 'Y' for yes or 'N' for No");  
				       String select = scan.next().toUpperCase(); 
				       if (select.equals("Y")) {  
				           this.accountType = true;
				           accountTypeValue="Yes";
				       } else if (select.equals("N")) {  
				           this.accountType = false;
				           accountTypeValue="No";
				       } else {
				    	   System.out.println("Invalid input..");
				       }
				       
				       	System.out.println(" ");
				       	System.out.println("Congrats!" + super.firstname + " " + super.lastName);
				       	System.out.println("Account Details are below: ");
				       	System.out.println("===============================*****===============================");
					
						isAccountApprovedValue = "Pending..";
						System.out.println("Is a Joint Account :" + this.accountTypeValue);
						System.out.println("Account Owner's Full Name : " + super.firstname + " " + super.lastName);
						System.out.print("Account Number:");generateAccountNumber(); 
						System.out.println("\nAccount Type: " + accountName);
						System.out.println("Creation Date : " + getCurrentDate);
						System.out.println("Account Status: " + isAccountApprovedValue);
						System.out.println("===============================*****===============================");
						
					if(isAccountApproved==false) {
						Register reg1 = new Register();
						while(true){
							System.out.println("Your application is pending and will be approved or denied within 5 Business day..");
							System.out.println("-Press '1' for LogOut");
							System.out.println("-Press '2' for Other Activities");
							int n = scan.nextInt();
							
							switch (n) {
								
							case 1: 
										// Welcome
										System.out.println(" ");
											reg1.welcomePage();
											System.out.println("===============================*****===============================");
									break;
							case 2: 
									//Client Activity Page
									System.out.println(" ");
										reg1.clientActivities();
										System.out.println("===============================*****===============================");
									break;
							case 3:
								System.exit(0);
							
							default:
								throw new IllegalArgumentException("Unexpected value: " + n);
							}
						}
						
					}else{
						System.out.println("==================================");
						isAccountApprovedValue = "Active";
						System.out.println("Account Number: " + accountNumber);
						System.out.println("Account Type: " + accountName);
						System.out.println("Account First Name: " + this.fName);
						System.out.println("Account First Last Name: " + this.lName);
						System.out.println("Account Created Date: " + getCurrentDate );
		
						System.out.println("Account Status: " + isAccountApprovedValue);
						System.out.println("==========================================");
						System.out.println("Option to be done");
						System.out.println("Choose 1 for Creating Account");
						System.out.println("Choose 2 for Deposit");
						System.out.println("Choose 3 for Withdraw");
						System.out.println("Choose 4 for Check Balance");
						System.out.println("Choose 5 for transfer");
						System.out.println("Choose the operation what you desire to do");
	
					}	
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void withdraw() {
			System.out.println("===============================*****===============================");
			System.out.println("withdraw Money Page ");
			System.out.println("Enter the amount: ");
			double newAmount = scan.nextDouble();
			if(newAmount < balance) {
				balance -= newAmount;
				System.out.println(fName + "  " + lastName + " has $ " + balance);
			}else {
				System.out.println("Withdrawal by " + fName + " " + lastName + "fails");
			}
		}
	//Deposit Fund
		public void deposit() {
			System.out.println("Deposit Money Page ");
			System.out.println("===============================*****===============================");
			//System.out.println("Enter the amount: ");
			System.out.println("Enter First Name: ");
			this.fName = scan.next();
			super.firstname = fName;
			
			System.out.println("Enter Last Name: ");
			this.lastName = scan.next();
			super.lastName = lastName;
			
			System.out.println("Enter the amount: ");
			double newAmount = scan.nextDouble();
			balance +=newAmount;
			System.out.println(this.fName + " " + this.lastName + "'s Current Balance is: $ " + balance);
		}
	//Show my account informations  
    public void showAccount() {    
    	System.out.println("===============================*****===============================");
		System.out.println("Show Current Balance Page ");
		System.out.println("Enter the amount: ");
        System.out.println("Your Current Balance is : " + balance);  
    }
	//Transfer fund
	public void transfer() {
		System.out.println("===============================*****===============================");
		System.out.println("Tansfer Money Page ");
		System.out.println("Enter the amount: ");
		System.out.println("Enter an amount to be tranfered: ");
		int amount = scan.nextInt();
		
		Client client = new Client();
		
		System.out.println("Enter the First Name :");
		String fName = scan.next();
		
		System.out.println("Enter the Last Name :");
		String lName = scan.next();
		
		if(this.balance < amount) {
			System.out.println("Transfer fails..Insufficient of money");
		}else {
			this.balance -=amount;
			client.balance += amount;
			System.out.println("Amount of " + this.fName + " " + super.lastName + " current balance is: $" + this.balance );
			System.out.println("Amount of " + fName + " " + lName + " current balance is: $" + client.balance );		
		}
	}
	
	//The method to search an account number  
    public boolean search() { 
    	System.out.println("Search Account..\nEnter Account Number: ");
    	char eAccountNumber = scan.next().charAt(0);
        if (accountNumber == eAccountNumber ) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }
	//Generate Bank Account Number
	public void generateAccountNumber() {
		Random rand = new Random();
	    String card = "AC";
	    try {
	    	for (int i = 0; i < 14; i++)
		    {
		        int n = rand.nextInt(10) + 0;
		        card += Integer.toString(n);
		    }
		    for (int i = 0; i < 16; i++)
		    {
		        if(i % 4 == 0)
		          System.out.print(" ");
		        char cardNumber = card.charAt(i);
		        System.out.print(cardNumber);
		        this.accountNumber=cardNumber;
		    }
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	        
	}
	
	
}
