/**
 * 
 */

import java.util.Scanner;
/**
 * @author dadjepon
 * @Eddy Kubwimana
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

        // this line is to ask a who the buyer is

        System.out.println("if you are are a student enter S, if not, enter :");
        keyboard.nextLine();
		String category = keyboard.nextLine();

		category = category.toLowerCase();
        double cost;

        if ( category.compareTo("s")== 0){
            //Computation of cost of product
            System.out.println("Since you are a student, you recieved a discount of 25%");
		    cost= productPrice * productQuantity;
            cost = cost-0.25*cost;

        } else{
             cost= productPrice * productQuantity;
        }
		
		//Print details of object to the screen
		System.out.println("The "+productName+ " costs is GHS" + cost);

		//Close Scanner object stream
		keyboard.close();
	}

}