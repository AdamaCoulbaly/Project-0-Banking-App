package BankingApp;

import java.util.Scanner;

public class Main {
     
	public static void main(String[] args) {
	    
		Register reg = new Register();
		reg.welcomePage();
		//reg.selectRole();
		
		//Creating Client Object	
		Client client = new Client();
				
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
			System.out.println("Choose the operation what you desire to do");
			int n = scan.nextInt();
			
			switch (n) {
				
			case 1: 
						client.createBankAcount();
						System.out.println(" ");
					break;
			case 2: 
				client.deposit();
					System.out.println(" ");
					break;
			case 3:
					client.withdraw();
						System.out.println(" ");
					break;
			case 4:
						client.showAccount();
					break;
			case 5:
						client.transfer();
						System.out.println(" ");
					break;
			case 6:
						client.transfer();
						System.out.println(" ");
					break;
			case 7:
				System.exit(0);
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
		}	
}

}
