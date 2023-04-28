package gh.edu.ashesi.OOPExample1package;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author dadjepon
 *
 */
public class SwearWordPolice {

	/**
	 * 
	 */
	public SwearWordPolice() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, String> swearWords = new
				HashMap<String, String>();
		
		swearWords.put("f**k", "Wash your mouth!");
		swearWords.put("sh*t", "Is that how you talk to your Mum!");
		
		System.out.println("Type a text here:");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		
		String [] decompose = text.split(" ", 10);
		String cleanedWord = "";
		for(String word : decompose) {
			if(word.equalsIgnoreCase("f**k")) {
				cleanedWord = text.replace("f**k", "bleep");
				System.out.println(""+swearWords.get(word));
			}
		}
		System.out.println("Cleaned word: "+cleanedWord);
	}

}
