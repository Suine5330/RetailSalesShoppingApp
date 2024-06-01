package SalesApplicationals;

import ProductProgramming.Product;

import java.util.Scanner;
import java.io.*;
public class SalesApplication 
{
	
	public static void main(String[]args) throws IOException
	{	
		//A String "choice" For Searching, Viewing, Or Closing The Application Feature//
		
		FileInputStream ProdApp = new FileInputStream("ProductApplicationShopping.txt");
		
		char choice = ' ';
		
		//The Do() Looping Sequence To Initiate Features Of The Functions//
		
		do 
		{
			
			//Creating An Initial Main-Menu For Retail Shopping//
			
			System.out.println("====================");
			System.out.println("Retail Sales Application Shopping");
			System.out.println("====================");
			System.out.println("Search(s) For Products, View(v) All Products, Or Close(c) Shopping Application");
			System.out.println("====================");
			
			//get user input for shopping//
			
			Scanner kb = new Scanner(System.in);
			choice = kb.next().charAt(0);
			
			if(choice == 's')
			{
				System.out.println("Starting A Search");
				String Search = kb.next();
				Product p = new Product();
				p.SearchProduct(Search);
			}
			else if(choice == 'v')
			{
				System.out.println("Starting View Of All Products");
				Product p = new Product();
				p.ViewAllProducts();
				
			}
			else 
			{
				System.out.println("Entered Invalid Input");
				
				
			}
			
		}
			
		//The Last while() looping sequence to close the Retail Sales Application//
			
			while(choice == 'c');
			System.out.println("=======================");
			System.out.println("Thank You For Shopping Our Retail Sales Application");
			System.out.println("=======================");
	
			ProdApp.close();
			
			FileOutputStream ProdAppOutput = new FileOutputStream("ProductApplicationShopping.txt");
			ProdAppOutput.close();
	}
		
}

	

