import java.util.Scanner();

/**
* @author John Adenu-Mensah
* @version 1.0.1
*/

public class OddSumChallenge{
    public static void main(String [] args){
         Scanner kbd = new Scanner(System.in);
        int userNumber;
        do{
        System.out.println("Enter a positive integer: ");
        userNumber = kbd.nextInt();
        
        } while (userNumber <= 0);
        int oddAcummulator = 0;

        // Long Answer
        for(int i = 1; userNumber > i; i += 2){
        oddAcummulator += i;
        }
        System.out.println("The long asnwer sum of odd numbers is " + oddAcummulator);

        // Short Answer
        int result = (userNumber/2)*(userNumber/2);
        System.out.println("The short answer sum of odd numbers is " + result);
    kbd.close();
    }
}