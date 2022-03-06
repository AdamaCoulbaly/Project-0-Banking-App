package BankingApp;

import java.util.Scanner;

public class Roles {
	Scanner scan = null;
	
	public String userRole;
	public String getRole() {
		return userRole;
	}
	public Roles() {
		
	}
	Admin admin = new Admin();
	
	public void selectRole() {
		scan = new Scanner(System.in);
		System.out.println("Please select a role for register: " + "Type 'A' for Admin | 'M' for Manager and 'C' for Cleint");
		String selectedRole = scan.nextLine().toUpperCase();
		
		try {
			while (selectedRole.equals("A") || selectedRole.equals("M") || selectedRole.equals("C") ) {
				if(selectedRole.equals("A")) {
					userRole = "Admin";
					System.out.println("Welcome to the Admin Login Registration Page");
					//adminRegister();
				}else if(selectedRole.equals("M")) {
					userRole = "Manager";
					System.out.println("Welcome to the Manager Login Registration Page");
					//managerRegister();
				}else if(selectedRole.equals("C")) {
					userRole = "Customer";
					System.out.println("Welcome to the Customer Login Registration Page");
					//clientRegister();
				}else {
					System.out.println("Invalid Role has been typed..Please try again!");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}	
	}

}
