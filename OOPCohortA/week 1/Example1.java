/**
 * Find Examples of Java Variable Widening and Type Casting
 */
package gh.edu.ashesi.OOPCohortA;

import java.util.Scanner;

/**
 * @author David Ebo Adjepon-Yamoah
 * @author Kwabena Buamono Aboagye-Otchere
 * @version 1.0.0
 *
 */
public class Example1 {

	/**
	 * Constructor
	 */
	public Example1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * The Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		byte byteNumber = 4;
		short shortNumber = 8;
		int intNumber = 16;
		double doubleNumber = 32;
		char character = 'O';

		System.out.println("Byte number is: "+ byteNumber);
		System.out.println("Short number is: "+ shortNumber);
		System.out.println("Integer number is: "+ intNumber);
		System.out.println("Double number is: "+ doubleNumber);
		System.out.println("Character is: "+ character);

		//Variable Widening
		intNumber = shortNumber;
		System.out.println("\nNew Integer number is: "+ intNumber);

		//Type Casting
		byteNumber = (byte)doubleNumber;
		System.out.println("New Byte number is: "+ byteNumber);

		//Using Scanner Class
		Scanner input = new Scanner(System.in);

		System.out.println("\nProvide number 1:");
		int var1 = input.nextInt();
		System.out.println("Provide number 2:");
		int var2 = input.nextInt();

		int sum = var1 + var2;

		System.out.println("\nSummation: "+ sum);
	}

}
