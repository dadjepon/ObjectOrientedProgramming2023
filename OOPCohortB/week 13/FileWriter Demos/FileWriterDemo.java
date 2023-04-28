package gh.edu.ashesi.OOPExample1package;

	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.*;

	/**
	 * @author dadjepon
	 * FileWriterDemo Class
	 * Java program to create a text File using FileWriter Class
	 */
	class FileWriterDemo {
	
		public static void main(String[] args)
			throws IOException
		{
			// initialize a string
			String str = "Writing text to File!";
			try {

				// attach a file to FileWriter
				FileWriter fw
					= new FileWriter("C:\\Users\\dadjepon\\eclipse-workspace\\gh.edu.ashesi.OOPExample1\\"
							+ "src\\gh\\edu\\ashesi\\OOPExample1package\\file.txt");
				
				// read each character from string and write
				// into FileWriter
				for (int i = 0; i < str.length(); i++)
					fw.write(str.charAt(i));
				
				//assure the developer/user that the program completed the file writing successfully
				System.out.println("Successfully written");

				// close the filewriter object (reference)
				fw.close();
			}
			//catch exceptions 
			catch (Exception e) {
				e.getStackTrace();
			}
		}
	}
