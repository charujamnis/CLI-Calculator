package com.dtcc.calculator;
import java.util.Scanner;

/*CLI Calculator - Part One
 * CLI Calculator - Part Two
 * Authors : Juaniesha and Charu*/

public class CLICalculator {

	public static void main(String[] args) {
				
			Scanner input = new Scanner(System.in);
			
			System.out.println("Welcome to the CLI Calculator");
			System.out.println("Operations: \na:Addition \ns:Subtraction \nm:Multiplication \nd:Division \ne:Exit");
			System.out.println("\nChoose your operation: ");
			int operation = input.nextInt();
			System.out.println("\nFirst Number: ");
			int number1 = input.nextInt();
			System.out.println("Second Number: ");
			int number2 = input.nextInt();
			int result;
				
			//addition
			if(operation == 1)
			{
				result = number1+number2;
				System.out.println("Result: "+result);
			}
			//subtraction
			else if(operation ==2)
			{
				result= number1-number2;
				System.out.println("Result: "+result);
			}
			//multiplication
			else if(operation==3)
			{	
				result = number1 * number2;
				System.out.println("Result: "+result);
			}
			//division
			else if(operation ==4)
			{
				if(number2==0)
				{
					System.out.println("Result: cannot be divide by 0");
				}
				else
				{
					result = number1/number2;
					System.out.println("Result: "+result);
				}
			}
			else
			{
				System.out.println("Please enter valid operation number...");
			}
	}

}
