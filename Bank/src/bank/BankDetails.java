package bank;

import java.util.Scanner;

public class BankDetails {
	private String accno;
	private String name;
	private String accType;
	private Long balance;
	
	Scanner scanner=new Scanner(System.in);
	//method to open new Account
	
	public void openAccoutn() {
		System.out.println("***** Anbu Tamilnadu Tranding Bank *****");
		System.out.println("Enter account no: ");
		accno=scanner.nextLine();
		System.out.println("Enter Name:");
		name=scanner.nextLine();
		//scanner.nextLine();
		System.out.println("Enter Account Type:");
		accType=scanner.nextLine();
		//scanner.next();
		
		//scanner.next();
		System.out.println("Enter Balance:");
     	balance=scanner.nextLong();
	}
	
	//method to display account details
	public void showAccount() {
		System.out.println("Name of account holder: "+name);
		System.out.println("Account no: "+accno);
		System.out.println("Account type: "+accType);
		System.out.println("Blance: "+balance);
	}
	
	//method to deposit money
	public void deposit() {
		System.out.println("Enter the amount you want to deposti:");
		long amt=scanner.nextLong();
		balance=balance+amt;
	}
	
	//method to withdraw money
	public void withdraw() {
		System.out.println("Enter the amount you want to withdraw :");
		long amt=scanner.nextLong();
		if(amt<=balance) {
			balance=balance-amt;
			System.out.println("Blance after withdraw: "+balance);
		}
		else {
			System.out.println("You balance is less then "+amt+"\tTransaction faild...!!");
		}
	}
	//method to search an account number
	public boolean search(String ac_no) {
		if(accno.equals(ac_no)) {
			showAccount();
			return true;
		}
		return false;
	}

}
