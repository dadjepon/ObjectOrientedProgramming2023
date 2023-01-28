

/**
 * Control Flow Package
 */
package gh.edu.ashesi.OOPExample1package;

//Imported Libraries/Packages
import java.util.Scanner;

/**
 * Class to demonstrate how Control Flows work: If-Else and Switch Case Statements
 * @author Ebo Adjepon-Yamoah
 * @author Ian Akotey
 * @author Kwabena Buamono Aboagye-Otchere
 * @author Common Floor Members of OOP Cohort A
 * @version 1.0.0
 *
 */
public class ControlFlow {

	/**
	 * Constructor
	 */
	public ControlFlow() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Method for providing an GPA description when a grade point is provided 
	 * IF-ELSE EXAMPLE
	 * @param none
	 * @return void
	 */
	public void gpaDescription() {
		//EXAMPLE1: If-Else Statement
		
		//Creates a Scanner object to take inputs from keyboard
		Scanner keyboard = new Scanner(System.in);
				
		//Prompt to take GPA input from the user 
		System.out.println("Enter your GPA: ");
				
		//TASK2: Gracefully handle the type mismatch input error
		double grade = keyboard.nextDouble();
				
		if (grade <= 4.0 && grade >= 3.85)
		{
			System.out.println("Summa Cum Laude");
		}
		else if (grade < 3.85 && grade >= 3.70)
		{
			System.out.println("Magna Cum Laude");
		}
		else if (grade < 3.70 && grade >= 3.50)
		{
			System.out.println("Cum Laude");
		}
		else if (grade < 3.50 && grade >= 3.00)
		{
			System.out.println("Second Class Upper");
		}
		else if (grade < 3.00 && grade >= 2.75)
		{
			System.out.println("Second Class Lower");
		}
			else if (grade < 2.75 && grade >= 2.50)
		{
			System.out.println("Third Class");
		}
		else if (grade < 2.50 && grade >= 2.25)
		{
			System.out.println("Pass");
		}
		else if (grade < 2.25 && grade >= 0)
		{
			System.out.println("Fail");
		}
		else 
		{
			System.out.println("You entered an invalid GPA");
		}
		
		//Close the stream <keyboard>
		keyboard.close();
	}

	/**
	 * Method for traffic light control 
	 * SWITCH CASE EXAMPLE
	 * @param none
	 * @return void
	 */
	public void trafficLight() {
		//EXAMPLE 2: Switch Case
		
				//Creates a Scanner object to take inputs from keyboard
				Scanner input = new Scanner(System.in);
				
				//Declare a boolean variable to identify status of Colour Blindness
				boolean colorBlindState;
				String state;
				
				System.out.println("Are you color blind? (true/false): ");
				colorBlindState = input.nextBoolean();
				
				if (colorBlindState) {
					System.out.println("Enter traffic light state \n(b for black, w for white, g for grey): ");
					state = input.next();
					
				// switch test
				switch(state) {
					//r: red light
					case("b"): System.out.println("Stop");
					break;
					
					//y: yellow/amber light
					case("w"): System.out.println("Slow down");
					break;
					
					//g: green light
					case("g"): System.out.println("Go");
					break;
					
					//b: black
					//case("b"): System.out.println("Stop");
					//break;
					
					//w: white light
					//case("w"): System.out.println("Slow down");
					//break;
					
					default: System.out.println("Traffic color wei dier");
				}
			}
			else{
				System.out.println("Please enter a colour:\n	--> r for red,"
						+"\n	--> y for yellow and\n	--> g for green");
					String scan = input.nextLine();
					
					// switch test
					switch(scan) {
						//r: red light
						case("r"): System.out.println("Stop");
						break;
						
						//y: yellow/amber light
						case("y"): System.out.println("Slow down");
						break;
						
						//g: green light
						case("g"): System.out.println("Go");
						break;
						
						//b: black
						//case("b"): System.out.println("Stop");
						//break;
						
						//w: white light
						//case("w"): System.out.println("Slow down");
						//break;
						
						default: System.out.println("Traffic color wei dier");
						break;
					}
				}
				
				//Closing Data Streams
				input.close();
	}
	
	/**
	 * Main method
	 * @param args
	 * @return void
	 * @exception none
	 */
	public static void main(String[] args) {
		
		//Instantiate the ControlFlow class NB: This is an alternative to using static keyword
		ControlFlow testMain = new ControlFlow(); 
				
		//Provide a menu prompt of options
		System.out.println("Hello User!\n\nWelcome to the OOP Menu [options]:");
		System.out.println("\n		'1' - Grade Point Average Description ");
		System.out.println("		'2' - Traffic Light Colour Description ");
		System.out.println("\nEnter '1' OR '2':");
				
		//Instantiate a Scanner class
		Scanner scan = new Scanner(System.in);
				
		//Declare an integer variable and initialise it with an integer input from keyboard
		int choice = scan.nextInt();
				
		//If-Else statements with conditions for menu options. 
		//Take note that the ControlFlow object is used with a dot operator to 
		//call the methods: gpaDescription and trafficLight
		if(choice == 1) testMain.gpaDescription();
		else if(choice == 2){testMain.trafficLight();}
		else {
			System.out.println("You have entered an invalid choice. Enter either '1' or '2'.");
		}
				
		//Close the <scan> stream
		scan.close();
		
		
	}
}


