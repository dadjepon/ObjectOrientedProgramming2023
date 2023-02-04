import java.util.Scanner;

/**
* @author John Adenu-Mensah
* @version 1.0.2 
*/

public class OddSumChallenge{
    public static void main(String [] args){
         Scanner kbd = new Scanner(System.in);
        int userNumber;
        // Do while for potential repeated errors in input.
        do{
        System.out.println("Enter a positive integer: ");
        userNumber = kbd.nextInt();
        } while (userNumber <= 0);
        int oddAcummulator = 0;

        // Long Answer
        for(int i = 1; userNumber > i; i += 2){
        // i += 2 cuts runtime in half and removes need for if statement for even/odd.
        oddAcummulator += i;
        }
        System.out.println("The long answer sum of odd numbers is " + oddAcummulator);

        // Short Answer
        int result = (userNumber/2)*(userNumber/2);
        System.out.println("The short answer sum of odd numbers is " + result);
        /**
        * Say, for a small number like 6, the odd numbers less than it are 1, 3, and 5.
        * The sum of 1 + 3 + 5 = 9. This is the same as dividing 6 by 2 (6/2 = 3, using
        integer division) and then squaring it (3*3 = 9).
        * This works for any even number and any even number plus 1. So for example:
        * the summ of odd numbers below 10 (even number) and 11 (even number plus 1) is 25.
        * This is possible because of integer division, which returns whole numbers.
        */
    kbd.close();
    }
}