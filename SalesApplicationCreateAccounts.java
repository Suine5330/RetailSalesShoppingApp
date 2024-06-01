package SalesApplicationAccounts;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.*;

public class SalesApplicationCreateAccounts 
{

	//Creating The Log-In Credentials For The Classes Needed//
	
		private static SalesApplicationCreateAccounts ManagerUserAccount;
		
		private static SalesApplicationCreateAccounts UserAccount;
		
		private SalesApplicationCreateAccounts() {}
		
		//Creating An getInstance For Creating A Manager User Account//
		
		public static SalesApplicationCreateAccounts getInstance()
		{
			if(ManagerUserAccount == null)
			{
				ManagerUserAccount = new SalesApplicationCreateAccounts();
				
			}
			return ManagerUserAccount;
		}
		
		//How To Initiate Getting The Log-In Credentials For A Manager User Account//
		
		public void getManagerUserAccount()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Manager User-Name");
			String ManagerUserName = input.nextLine();
			System.out.println("");
			Scanner input2 = new Scanner(System.in);
			System.out.println("Enter Manager User-Password");
			String ManagerUserPassword = input2.nextLine();
		}
		
		public void getManagerContactName() 
		{ 
			Scanner input = new Scanner(System.in);
			System.out.println("Enter A Manager Contact Name");
			String ManagerContactName = input.nextLine();
			
		}
		
		public void getManagerContactPhoneNumber()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter A Manager Contact Phone Number");
			String ManagerContactPhoneNumber = input.nextLine();
			
		}
		
		public void getManagerContactEMail()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter A Manager Contact E-Mail");
			String ManagerContactEMail = input.nextLine();
			
		}
		
		//Creating An getInstance For Creating A User Account//
		
		public static SalesApplicationCreateAccounts getInstance2() 
		{
			if(UserAccount == null) 
			{
				UserAccount = new SalesApplicationCreateAccounts();
			}
			return UserAccount;
		}
		
		//How To Initiate Getting The Log-In Credentials For A User Account//
		
		public void getUserAccount()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter User-Name");
			String UserName = input.nextLine();
			System.out.println("");
			Scanner input2 = new Scanner(System.in);
			System.out.println("Enter User-Password");
			String UserPassword = input2.nextLine();
		}
		
		public void getContactName() 
		{ 
			Scanner input = new Scanner(System.in);
			System.out.println("Enter A Contact Name");
			String ContactName = input.nextLine();
			
		}
		
		public void getContactPhoneNumber()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter A Contact Phone Number");
			String ContactPhoneNumber = input.nextLine();
			
		}
		
		public void getContactEMail()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter A Contact E-Mail");
			String ContactEMail = input.nextLine();
			
		}
		
	}

	//The Main Class Section For Running Functionality Of The Programming//

	class Main 
	{
		static Logger logger = Logger.getLogger(SalesApplicationCreateAccounts.class.getName());

		
		public static void main(String[]args) throws IOException
		{
			try 
			{
				LogManager.getLogManager().readConfiguration(new FileInputStream("SalesApplicationProgramming.log"));
			}
			catch (SecurityException | IOException e1)
			{
				e1.printStackTrace();
			}
			logger.setLevel(Level.FINE);
			logger.addHandler(new ConsoleHandler());
			
			try {
		        // Create a FileHandler that uses a SimpleFormatter.
		        FileHandler fileHandler = new FileHandler("SalesApplicationProgramming.log", true);
		        fileHandler.setFormatter(new SimpleFormatter());

		        // Add the handler to the logger.
		        logger.addHandler(fileHandler);

		        // Set the default logging level (e.g., INFO, SEVERE, FINE)
		        logger.setLevel(Level.INFO);

		        

		        System.out.println("");
		        
		        // Log a SEVERE message.
		        logger.warning("User Accounts Should Be Created Confidentially, And Not Be Revealed To Another Person");

		        System.out.println("");
		        
		        // Log a FINE message.
		        logger.fine("Otherwise You Will Be Fined");

		    	} 
				catch (Exception e) 
		    	{
		            logger.log(Level.SEVERE, "Error occur in FileHandler.", e);
		        }
			
			System.out.println("=============");
			System.out.println("Creating A User Account Command");
			System.out.println("1.)Manager User Account");
			System.out.println("2.)Employee USer Account");
			
			//Generating A Selection "choice" For A Product You Are Wanting//
			
			Scanner IS = new Scanner(System.in);
			System.out.println("Select Which User Account You Want To Create");
			int choice = IS.nextInt();
			
			switch(choice)
			{
				case 1:
					
					FileInputStream ManAcct = new FileInputStream("CreatedManagerAccount.txt");
					
					System.out.println("Create Manager User Account");
					System.out.println("");
					SalesApplicationCreateAccounts MUA1;
					
					MUA1 = SalesApplicationCreateAccounts.getInstance();
					
					MUA1.getManagerUserAccount();
					System.out.println();
					MUA1.getManagerContactName();
					System.out.println();
					MUA1.getManagerContactPhoneNumber();
					System.out.println();
					MUA1.getManagerContactEMail();
					System.out.println();
					
					System.out.println("Manager User Account Created");
					System.out.println("");
					
					ManAcct.close();
					
					FileOutputStream ManAcctOutput = new FileOutputStream("CreateManagerAccount.txt");
					ManAcctOutput.close();
					
					break;
				case 2:
					
					FileInputStream UserAcct = new FileInputStream("CreatedUserAccount.txt");
					
					System.out.println("Create A User Account");
					System.out.println("");
					
					SalesApplicationCreateAccounts UA2;
					
					UA2 = SalesApplicationCreateAccounts.getInstance2();
					
					UA2.getUserAccount();
					System.out.println();
					UA2.getContactName();
					System.out.println();
					UA2.getContactPhoneNumber();
					System.out.println();
					UA2.getContactEMail();
					System.out.println();
					
					System.out.println("User Account Created");
					System.out.println("");
					
					UserAcct.close();
					
					FileOutputStream UserAcctOutput = new FileOutputStream("CreateUserAccount.txt");
					UserAcctOutput.close();
					
					break;
				default:
					break;
			}
			
			//Calling Upon Voids Created To Create The Manager User Account//
			
			
			
			//Calling Upon Voids To Create The User Account// 
			
			
			// Log a message at INFO level.
	        logger.info("Remember Your User Account Credentials That You Have Created");	
			
		//////////////////////////////////////////////////////////////////////
	
		}
}	
	
	
	
	
	
	
	
	
	
	

