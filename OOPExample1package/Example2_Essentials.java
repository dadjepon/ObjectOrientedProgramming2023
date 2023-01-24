/**
 * 
 */
package gh.edu.ashesi.OOPExample1package;
import java.util.Scanner;
/**
 * @author dadjepon
 *
 */
public class Example2_Essentials {

	/**
	 * 
	 */
	public Example2_Essentials() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String productName = keyboard.nextLine();
		double productPrice = keyboard.nextDouble();
		int productQuantity = keyboard.nextInt();
		double cost= productPrice * productQuantity;
		System.out.println("The cost is " + cost);
		

	}

}
