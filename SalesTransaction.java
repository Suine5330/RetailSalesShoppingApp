package SalesTransactions;

import java.util.Scanner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.*;


public class SalesTransaction 
{
	
	static Logger logger = Logger.getLogger(SalesTransaction.class.getName());
	
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
            logger.warning("Sales Tranactions Are Final, And May Only Be Request Under Certain Legal Circumstances");

            System.out.println("");
            
            // Log a FINE message.
            logger.fine("Otherwise You Will Be Fined");

        	} 
    		catch (Exception e) 
	    	{
	            logger.log(Level.SEVERE, "Error occur in FileHandler.", e);
	        }
		
		//Generating A Retail Sales Shopping Menu For Selecting A Product//
		
    	FileInputStream SaleTran = new FileInputStream("ProductSalesTransactions.txt");
    	
		System.out.println("=============");
		System.out.println("Retail Product View");
		System.out.println("1.)6-Pack Beverages");
		System.out.println("2.)12-Pack Beverages");
		System.out.println("3.)16-Pack Beverages");
		System.out.println("4.)24-Pack Beverages");
		System.out.println("5.)6-Collector Glasses");
		System.out.println("6.)12-Collector Glasses");
		
		//Generating A Selection "choice" For A Product You Are Wanting//
		
		Scanner IS = new Scanner(System.in);
		System.out.println("Select Which Products You Want");
		int choice = IS.nextInt();
		
		//An Option To Select A Quantity Of How Much Of The Product Your Requesting//
		
		
		// Log a message at INFO level.
        logger.info("Input A Correct Quantity, You May Not Revise Your Selection");
		
		
		if (choice >= 1  && choice <= 6)
		{
			
			
			System.out.println("Please Enter The Quanity");
			
			
		}
			int quantity = IS.nextInt();
			double price;
			
		//An Option To Select Which Product You Will Be Purchasing//	
			
			switch(choice)
			{
				case 1:
					price = 7.00;
					break;
				case 2:
					price = 9.00;
					break;
				case 3:
					price = 14.00;
					break;
				case 4:
					price = 17.00;
					break;
				case 5:
					price = 12.00;
					break;
				case 6: 
					price = 19.00;
					break;
				default:
					price = 0.00;
					break;
			}
			
			//The Variable Necessary To Complete A Retail Sales Transaction//
			
				double SubTotal = (price * quantity);
				double SalesTax = (SubTotal * 0.065);
				double TotalSale = (SubTotal + SalesTax);
				
			//Generation Of A Retail Sales Receipt Through Retail Sales Application//	
				
				System.out.println("Product Sold: " + choice);	
				System.out.println("======");
				System.out.println("Quanity Purchased " + quantity);
				System.out.println("======");
				System.out.println("Sub-Total" + SubTotal);
				System.out.println("Taxes Applied" + SalesTax);
				System.out.println("======");
				System.out.println("Total-Sale" + TotalSale);
				System.out.println("======");
				System.out.println("Thank You For Shopping Our Retail Sales Application");
			
				SaleTran.close();
				
				FileOutputStream SaleTranOutput = new FileOutputStream("ProductSalesTransactions.txt");
				
				SaleTranOutput.close();
				
			}
			
	}
	
	

