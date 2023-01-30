/**
 *
 */
package gh.edu.ashesi.OOPCohortA;
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
		//Create a Scanner object to take inputs from Keyboard
		Scanner keyboard = new Scanner(System.in);

		//Inputs from keyboard using Scanner object
		System.out.println("Input name of product:");
		String productName = keyboard.nextLine();

		System.out.println("Input price of product:");
		double productPrice = keyboard.nextDouble();

		System.out.println("Input quantity of product:");
		int productQuantity = keyboard.nextInt();

		//Computation of cost of product
		double cost= productPrice * productQuantity;

		//Print details of object to the screen
		System.out.println("The "+productName+ " costs is GHS" + cost);

		//Close Scanner object stream
		keyboard.close();
	}

}
