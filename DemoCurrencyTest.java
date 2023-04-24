package demoTest;

import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class DemoCurrencyTest {
	
	double AmountInYen;
	double AmountInDollar;
	 DecimalFormat f = new DecimalFormat("##.##");
	 static Scanner sc = new Scanner(System.in);
	 
    //To initialize user Input options and Amount 
    @BeforeAll
	static void enterValue() {
		  System.out.println("Following are the Choices:");
	      System.out.println("Enter 1: Dollar To Yen");
	      System.out.println("Enter 2: Yen to Dollar");
		  DemoCurrencyCode.option = sc.nextInt(); // To take input option from Key board
		  
	}
	
	@Test //Actual conversion
	void Test_Case_For_ConversionUsingOption() {
		DemoCurrencyCode.SelectconvertOption();
		
		}
	
	
	@Test //Check for Valid Input amount
	 void Positive_Test_Case_For_ConversionUsingOption() {
	 Assert.assertTrue(DemoCurrencyCode.amount>0);;
	 System.out.println("Valid input");
	 
	 }
	 
	 
	 @Test //Check for Valid Input amount
	 void Negative_Test_Case_For_ConversionUsingOption() {
	 Assert.assertTrue(DemoCurrencyCode.amount<0);;
	 System.out.println("Pass Valid input");
	 }
}
	 

	
	 
	
