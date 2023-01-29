/**
 * Find Examples on Type Casting and Variable Widening
 */
package gh.edu.ashesi.OOPCohortB;

import java.util.Scanner;

/**
 * @author David Ebo Adjepon-Yamoah
 * @author Ian Akotey
 * @version 1.0.0
 *
 */
public class Example1 {

	/**
	 * Constructors
	 */
	public Example1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		//Declaring and initiliasing variables
		byte byteVariable = 1;
		short shortVariable = 2;
		int intVariable = 4;
		long longVariable = 8;
		double doubleVariable = 16;
		char character = 'P';
		
		System.out.println("Byte Variable: "+ byteVariable);
		System.out.println("Short Variable: "+ shortVariable);
		System.out.println("Integer Variable: "+ intVariable);
		System.out.println("Long Variable: "+ longVariable);
		System.out.println("Double Variable: "+ doubleVariable);
		System.out.println("Character: "+ character);
		//System.out.println("");
		
		//Variable Widening
		intVariable = byteVariable;
		System.out.println("\nNew Integer Variable: "+ intVariable);

		//Type Casting
		byteVariable = (byte)intVariable;
		System.out.println("New Byte Variable: "+byteVariable);
		
		intVariable = (int) doubleVariable;
		System.out.println("New Double Variable: "+intVariable);
		
		//Summation
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		int firstNumber = input.nextInt();
		System.out.println("Please enter the second number:");
		int secondNumber = input.nextInt();
		
		int sum = firstNumber + secondNumber;
		System.out.println("Summation value: "+sum);
		
		//Close the input Stream
		input.close();
	}
	

}
