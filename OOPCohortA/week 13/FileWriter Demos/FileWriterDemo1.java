package gh.edu.ashesi.OOPExample1package;

import java.io.FileWriter;

/**
 * @author dadjepon
 * FileWriterDemo1 Class
 * Java program to write text to file using FileWriter Class
 */
public class FileWriterDemo1 {
	

		/**
		 * Main Method
		 * @param args
		 */
		public static void main(String args[])
		{
			//String to write to file
			String data = "Welcome to OOP File";

			try {
				// Creates a FileWriter
				//Note the behaviour of the true and false second parameters of the FileWriter constructor

				FileWriter output
					= new FileWriter("output.txt", false);
				
				// Writes the string to the file
				output.write(data);
				
				System.out.println("Successfully written");

				// Closes the writer
				output.close();
			}

			//Any exception that occurs in the try block is caught
			catch (Exception e) {
				e.getStackTrace();
			}
		}
	}
