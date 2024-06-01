package UserAccountContactEditing;

import SalesApplicationAccounts.SalesApplicationCreateAccounts;

import java.util.Scanner;

public class ContactEditing 
{
	
	
	
	public static void main(String[]args)
	{
		
		//Accessing Manager USer Account With Log-in Credentials//
		
			SalesApplicationCreateAccounts MUA1;
			MUA1 = SalesApplicationCreateAccounts.getInstance();
			
			MUA1.getUserAccount();
			System.out.println();
			
			
			System.out.println("User Account Accessed");
			
		//Manager User Account Menu To Edit A Contact//
			
			System.out.println("User Account Contact Editing");
			System.out.println("");
			Scanner BL = new Scanner(System.in);
			System.out.println("Do You Wish To Edit A User Account? (y/n)");
				boolean contactedit = BL.nextLine().toLowerCase().startsWith("y");
				
				if(contactedit) 
				{
					System.out.println("Edit User Account:");
					System.out.println("");
					
					SalesApplicationCreateAccounts UA2;
					
					UA2 = SalesApplicationCreateAccounts.getInstance2();
					System.out.println("Edit User Account & Password");
					
					UA2.getUserAccount();
					System.out.println("");
					System.out.println("Edit Contact Name:");
					UA2.getContactName();
					System.out.println("");
					System.out.println("Edit Contact Phone Number:");
					UA2.getContactPhoneNumber();
					System.out.println("");
					System.out.println("Edit Contact E-Mail:");
					UA2.getContactEMail();
					
					System.out.println("");
					
					System.out.println("User Account Contact Information Edited");
					
					
				}
				else
				{
					System.out.println("Exit");
				}
		}
		
			
}

