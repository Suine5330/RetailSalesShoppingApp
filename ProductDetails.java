package ProductDetailsProgramming;

import SalesApplicationAccounts.SalesApplicationCreateAccounts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class ProductDetails 
{
	public static void main(String[]args) throws IOException
	{
		//Initiation To Input Log-In Credentials For A Manager User Account//
		
		SalesApplicationCreateAccounts MUA1;
		MUA1 = SalesApplicationCreateAccounts.getInstance();
		
		MUA1.getManagerUserAccount();
		System.out.println();
		
		
		System.out.println("User Account Accessed");
		
		//Generation Of Product Main Menu For Product Descriptions To Be Added//
		
		FileInputStream ProdDetAdd = new FileInputStream("ProductDetailAdded.txt");
		
		System.out.println("============");
		System.out.println("Adding Product Details To Retail Application");
		System.out.println("1.)6-Pack Beverages");
		System.out.println("2.)12-Pack Beverages");
		System.out.println("3.)16-Pack Beverages");
		System.out.println("4.)24-Pack Beverages");
		System.out.println("5.)6-Collector Glasses");
		System.out.println("6.)12-Collector Glasses");
		
		//Input To Select Which Product Should Have A Description Added//
		
		
		Scanner PD = new Scanner(System.in);
		System.out.println("Select Which Product To Add Description");
		int choice = PD.nextInt();
		
		//Selection Option For A Product To Have A Description Added//
	
		switch(choice)
		{
			case 1:
				Scanner PDA = new Scanner(System.in);
				System.out.println("Product Description");
				String ProductDetail = PDA.nextLine(); 
				break;
			case 2:
				Scanner PDA2 = new Scanner(System.in);
				System.out.println("Product Description");
				String ProductDetail2 = PDA2.nextLine();
				break;
			case 3:
				Scanner PDA3 = new Scanner(System.in);
				System.out.println("Product Description");
				String ProductDetail3 = PDA3.nextLine();
				break;
			case 4:
				Scanner PDA4 = new Scanner(System.in);
				System.out.println("Product Description");
				String ProductDetail4 = PDA4.nextLine();
				break;
			case 5:
				Scanner PDA5 = new Scanner(System.in);
				System.out.println("Product Description");
				String ProductDetail5 = PDA5.nextLine();
				break;
			case 6: 
				Scanner PDA6 = new Scanner(System.in);
				System.out.println("Product Description");
				String ProductDetail6 = PDA6.nextLine();
				break;
			default:
				break;
		}
		
		//Confirmation The Product Description Has Been Added//
		
			System.out.println("Product Description Added");
		ProdDetAdd.close();
		
		FileOutputStream ProdDetAddOutput = new FileOutputStream("ProductDetailAdded.txt");
		
		ProdDetAddOutput.close();
		
	}	
	
	
}
