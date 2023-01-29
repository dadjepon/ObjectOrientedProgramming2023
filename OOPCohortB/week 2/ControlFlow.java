/**
 * Control Flow Package
 */
package gh.edu.ashesi.OOPCohortB;

//Imported Libraries/Packages
import java.util.Scanner;

/**
 * Class to demonstrate how Control Flows work: If-Else and Switch Case Statements
 * @author Ebo Adjepon-Yamoah
 * @author Ian Akotey
 * @author Kwabena Buamono Aboagye-Otchere
 * @author Common Floor Members of OOP Cohort B
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
	 * Method to print letter grades to screen when a grade is provided from the keyboard
	 * IF-ELSE Statement EXAMPLE
	 * @param none
	 * @return void
	 */
	public void letterGrade() {
		//Create a Scanner object for keyboard inputs
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your score: ");
		double score = input.nextDouble();

	    if(score>100 || score < 0){
			System.out.println("Please enter a score between 0 and 100");
			letterGrade();
		}
		 else if(score <=100 && score >= 85){
			System.out.println("Your letter grade is A+");
		}
		
		else if(score >= 80){
			System.out.println("Your letter grade is A");
		}
		else if(score >= 75){
			System.out.println("Your letter grade is B+");
		}
		else if(score >= 70){
			System.out.println("Your letter grade is B");
		}
		else if(score >= 65){
			System.out.println("Your letter grade is C+");
		}
		else if(score >= 60){
			System.out.println("Your letter grade is C");
		}
		else if(score >= 55){
			System.out.println("Your letter grade is D+");
		}
		else if(score >= 50){
			System.out.println("Your letter grade is D");
		}
		else {
			System.out.println("You failed the course");
		}
		
	    //Close input stream
		input.close();
		
	}
	
	/**
	 * Method for traffic light control 
	 * SWITCH CASE EXAMPLE
	 * @param none
	 * @return void
	 */
	public void trafficLight() {
		//Create a Scanner object for keyboard inputs
		Scanner input = new Scanner(System.in);
		
		//Prompt user to provide 
		System.out.println("Please enter a colour:\n	--> red,"
							+"\n	--> yellow and\n	--> green");
				
		//Get String input from keyboard and converting it into Lower Case
		String colour = input.nextLine().toLowerCase();
				
		switch(colour) {
			case("red"): System.out.println("Red means 'Stop'");
			break;
		
			case("yellow"): System.out.println("Yellow means 'Get Ready'");
			break;
			
			case("green"): System.out.println("Green means 'Go Go Go and Go'");
			break;
			
			default: System.out.println("Enter a valid colour character 'r','g', or 'y' ");
		}
				
		//Closing the Stream
		input.close();
	}

	/**
	 * Main Method
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		//Instantiate the ControlFlow class NB: This is an alternative to using static keyword
		ControlFlow testMain = new ControlFlow(); 
		
		//Provide a menu prompt of options
		System.out.println("Hello User!\n\nWelcome to the OOP Menu [options]:");
		System.out.println("\n		'1' - Grade Letter Description ");
		System.out.println("		'2' - Traffic Light Colour Description ");
		System.out.println("\nEnter '1' OR '2':");
		
		//Instantiate a Scanner class
		Scanner scan = new Scanner(System.in);
		
		//Declare an integer variable and initialise it with an integer input from keyboard
		int choice = scan.nextInt();
		
		//If-Else statements with conditions for menu options. 
		//Take note that the ControlFlow object is used with a dot operator to 
		//call the methods: letterGrade and trafficLight
		if(choice == 1) testMain.letterGrade();
		else if(choice == 2){testMain.trafficLight();}
		else {
			System.out.println("You have entered an invalid choice. Enter either '1' or '2'.");
		}
		
		//Close the <scan> stream
		scan.close();
		
	}

}
