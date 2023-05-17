package bank;

import java.util.Scanner;

public class BanckApplication {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//create initial accounts
		System.out.println("How many number of customer do you want to input ?");
		int n=scanner.nextInt();
		
		BankDetails cr[]=new BankDetails[n];
		for(int i=0;i<cr.length;i++) {
			cr[i]=new BankDetails();
			cr[i].openAccoutn();
		}
		//loop runs until number 5 is not press to exit
		
		int ch;
		do {
			System.out.println("***** Anbu Tamilnadu Tranding Bank *****");
			System.out.println("\n---- Banking System Application ----");
			System.out.println("1.Display all account details\n2.Search by Account number\n3.Deposit Amount\n4.Withdraw the amount\n5.Exit");
			System.out.println("************ && ***********");
			System.out.println("Enter your choice :");
			ch=scanner.nextInt();
			switch(ch) {
			case 1:
				for(int i=0;i<cr.length;i++) {
					cr[i].showAccount();
				}
				break;
			case 2:
				System.out.println("Enter accoutn no.you want to search:");
				String ac_no=scanner.next();
				boolean found=false;
				for(int i=0;i<cr.length;i++) {
					found=cr[i].search(ac_no);
					if(found) {
						break;
					}
				}
				if(!found) {
					System.out.println("Search faild! Account doesn't exist..!!");
				}
				break;
				
			case 3:
				System.out.println("Enter Account no:");
				ac_no=scanner.next();
				found=false;
				for(int i=0;i<cr.length;i++) {
					found=cr[i].search(ac_no);
					if(found) {
						cr[i].deposit();
						break;
					}
				}
				if(!found) {
					System.out.println("Search failed! Account doens't exist..!!");
				}
				break;
				
			case 4:
				System.out.println("Enter Account No:");
				ac_no=scanner.next();
				found=false;
				for(int i=0;i<cr.length;i++) {
					found=cr[i].search(ac_no);
					if(found) {
					cr[i].withdraw();
					break;
				}
			}
			if(!found) {
				System.out.println("Search failed! Account doens't exist..!!");
			}
			break;
			
			case 5:
				
				System.out.println("See you soon...");
			}
	}
	     while (ch != 5);  


	}

}
