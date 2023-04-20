package gh.edu.ashesi.OOPExample1package;

//Importing input-output classes
import java.io.*;

/**
 * @author dadjepon
 * Java program to illustrate Reading from FileReader 
 * using BufferedReader Class
 */
public class ReadFromFileUsingBufferedReader {
	
	// main driver method
	public static void main(String[] args) throws Exception
	{

		// File path is passed as parameter - try "output.txt"
		// NB: BufferedReader automatically overwrite text in file
		File file = new File("C:\\Users\\dadjepon\\eclipse-workspace\\gh.edu.ashesi.OOPExample1\\"
				+ "src\\gh\\edu\\ashesi\\OOPExample1package\\file.txt");

		// Note: Double backquote is to avoid compiler interpret words
		// like \test as \t (ie. as an escape sequence)

		// Creating an object of BufferedReader class
		BufferedReader br
			= new BufferedReader(new FileReader(file));

		// Declaring a string variable
		String str;
		int count = 1;
		// Condition holds true till
		// there is no character in a string
		while ((str = br.readLine()) != null)

			// Print the string to the screen
			System.out.println(count+": "+str);
			count++;
		//close the BufferedReader object, <i>br</i>
		br.close();
	}
}
