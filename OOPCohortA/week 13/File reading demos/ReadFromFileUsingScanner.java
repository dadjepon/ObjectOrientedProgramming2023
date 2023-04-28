package gh.edu.ashesi.OOPExample1package;

	import java.io.File;
	import java.util.Scanner;
	
	/**
	 * @author dadjepon
	 * FileWriterDemo1 Class
	 * Java Program to illustrate reading from Text File using Scanner Class
	 */
	public class ReadFromFileUsingScanner
	{
		public static void main(String[] args) throws Exception
		{
			// pass the path to the file as a parameter - try with ONLY "output.txt"
			// NB: ensure that either file.txt or output.txt is created before running this code. 
			// What happens when the file does not exist but you run this code? 
			File file = new File("C:\\Users\\dadjepon\\eclipse-workspace\\gh.edu.ashesi.OOPExample1\\"
					+ "src\\gh\\edu\\ashesi\\OOPExample1package\\file.txt");
			
			Scanner scan = new Scanner(file);
	
			while (scan.hasNextLine())
				System.out.println(scan.nextLine());
			
			//close Scanner object
			scan.close();
		}
	}

