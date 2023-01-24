/**
 * 
 */
package gh.edu.ashesi.OOPCohortB;

import java.util.Scanner;
/**
 * @author dadjepon
 *
 */
public class Essentials {

	/**
	 * Constructor
	 */
	public Essentials() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter Product Name: ");
		String productName = kbd.nextLine();
		System.out.println("Enter Product Price: ");
		double productPrice = kbd.nextDouble();
		System.out.println("Enter Product Quantity: ");
		int productQuantity = kbd.nextInt();
		System.out.println("Enter Product Weight: ");
		double productWeight = kbd.nextDouble();
		
		double totalCost = productPrice*(double)productQuantity;
		
		System.out.println("Product: "+productName +" Cost: "+totalCost + " Weight: " + productWeight);

	}

}
