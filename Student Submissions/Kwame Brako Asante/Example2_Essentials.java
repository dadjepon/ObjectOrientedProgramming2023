
import java.util.Scanner;
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

        System.out.println("Enter buyer status: ");
        String buyerStatus = keyboard.nextLine();

		System.out.println("Input name of product:");
		String productName = keyboard.nextLine();

		System.out.println("Input price of product:");
		double productPrice = keyboard.nextDouble();

		System.out.println("Input quantity of product:");
		int productQuantity = keyboard.nextInt();

		//Computation of cost of product
		double cost= productPrice * productQuantity;

        //Computation of discount if user is a student
        if (buyerStatus.equals("student")){
            double discount = 0.25 * cost;
            cost -= discount;
        }


		//Print details of object to the screen
		System.out.println("The "+productName+ " costs is GHS" + cost);

		//Close Scanner object stream
		keyboard.close();
	}

}

