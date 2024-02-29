/**************
 Name: Jules Merrill
 Date: February 29th, 2024
 Project: Circle Application
 ************/
import java.util.*;

public class circle_application{
    public static void main(String[] args){
        double pi = 3.14159;
        double radius;
        double area;
        double circumference;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        radius = input.nextDouble();
        area = pi*radius*radius;
        circumference = 2*pi*radius;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}