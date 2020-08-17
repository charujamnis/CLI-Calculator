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
			char operation = input.next().charAt(0);
			System.out.println("\nFirst Number: ");
			int number1 = input.nextInt();
			System.out.println("Second Number: ");
			int number2 = input.nextInt();
			int result;
			double result1;
				
			//addition
			if(operation == 'a')
			{
				result = number1+number2;
				System.out.println("Result: "+result);
			}
			//subtraction
			else if(operation =='s')
			{
				result= number1-number2;
				System.out.println("Result: "+result);
			}
			//multiplication
			else if(operation=='m')
			{	
				result = number1 * number2;
				System.out.println("Result: "+result);
			}
			//division
			else if(operation =='d')
			{
				if(number2==0)
				{
					System.out.println("Result: cannot be divide by 0");
				}
				else
				{
					double d1 = number1; // only for division
					double d2 = number2;
					result1 = d1/d2;
					System.out.printf("Result: %.2f", result1);
					
				}
			} 
			else if (operation == 'e')
			{
				System.out.println("Goodbye!");
			}
			else
			{
				System.out.println("Please enter valid operation number...");
			}
	}

}
