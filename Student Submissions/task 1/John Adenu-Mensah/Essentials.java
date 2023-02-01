/**
 * 
 */
package gh.edu.ashesi.OOPCohortB;

import java.util.Scanner;
/**
 * @author dadjepon
 * @author John Adenu-Mensah
 * @version 1.0.1
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
		double studentDiscount = totalCost*0.25;
		double finalCost = totalCost - studentDiscount;
		double totalWeight = productQuantity*productWeight;


		System.out.println("Are you a student?(Y/N) ");
		String isStudent = kbd.next();
		if(isStudent.equals("Y")){
			System.out.println("Product: "+productName +" Cost: "+finalCost + " Weight: " + totalWeight);
		}
		else{
			System.out.println("Product: "+productName +" Cost: "+totalCost + " Weight: " + totalWeight);
		}
	kbd.close();
	}
}