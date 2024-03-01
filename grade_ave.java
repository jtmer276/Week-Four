/******************
 * Jules Merrill
 * Project: Grade Average
 * Date: March 1
 ******************/
import java.util.*;

public class grade_ave{
    public static void main (String[] args){
        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;
        double grade_average;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade one: ");
        grade1 = input.nextInt();
        System.out.print("Enter grade two: ");
        grade2 = input.nextInt();
        System.out.print("Enter grade three: ");
        grade3 = input.nextInt();
        System.out.print("Enter grade four: ");
        grade4 = input.nextInt();
        System.out.print("Enter grade five: ");
        grade5 = input.nextInt();
        grade_average = grade1 + grade2 + grade3 + grade4 + grade5;
        grade_average = grade_average/5;
        System.out.println("Your grade average is: " + grade_average);
    }
}
