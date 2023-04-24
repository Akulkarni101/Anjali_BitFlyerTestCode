package demoTest;

import java.util.Scanner;

import org.junit.Assert;

public class DemoCurrencyCode {
	static double amount;
	static double yenValue;
	static double dollerValue;
	static int option;
	static Scanner sc = new Scanner(System.in);
	
	public static void SelectconvertOption() {
		if ( option == 1)
		{ 
			System.out.println("Enter the amount"); 
			DemoCurrencyCode.amount = sc.nextFloat();// To take input Amount from Key board
			
			if(amount>0) {
			DollarToYenConverter();
			}else {
				System.out.println("Invalid Amount" );
			}
		}
		else if(option == 2)
		{ 
			System.out.println("Enter the amount"); 
			DemoCurrencyCode.amount = sc.nextFloat();// To take input Amount from Key board  
			if(amount>0) {
			YenToDollarConverter();
		}else {
			System.out.println("Invalid Amount" );
		}
	    }else {
	    	System.out.println("Invalid Option" );
	    	}
		
}
	

	public static void YenToDollarConverter() {
		yenValue = amount * 0.008;
		System.out.println("Converterted Yen To Dollar amount is " + DemoCurrencyCode.yenValue); 
		
	}

	public static void DollarToYenConverter() {
		dollerValue = amount * 111.087;
		System.out.println("Converterted Dollar To Yen amount is " + DemoCurrencyCode.dollerValue); 
		
	}
    
}
