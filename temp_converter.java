/*****************
 Jules Merrill
 March 1st 2024
Project: Temp Converter
 ******/
import java.util.*;
public class temp_converter{
    public static void main(String[] args){
        int fahrenheit;
        double celsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fahrenheit temperature: ");
        fahrenheit = input.nextInt();
        celsius = (fahrenheit - 32)*5/9;
        System.out.println("The temperature in celsius is: " + celsius);
    }
}