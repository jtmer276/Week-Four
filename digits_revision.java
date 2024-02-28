/*************
 * Name: Jules Merrill
 * Date: February 28th, 2024
 * Assingment: digits.jave
 */
import java.util.*;

public class digits_revision{

  public static void main(String[] args){
      int initial_number;
      int ones;
      int initial_tens;
      int hundreds;
      int tens;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a three-digit number: ");
      initial_number = input.nextInt();
      ones = initial_number%10;
      initial_number = initial_number - ones;
      initial_tens = initial_number%100;
      initial_number = initial_number - initial_tens;
      hundreds = initial_number/100;
      tens = initial_tens/10;
      System.out.println("The hundreds place digit is: " + hundreds);
      System.out.println("The tens place digit is: " + tens);
      System.out.println("The ones place digit is: " + ones);


  }
}