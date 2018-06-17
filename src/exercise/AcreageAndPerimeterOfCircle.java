package exercise;

import java.util.Scanner;

public class AcreageAndPerimeterOfCircle {
    public static void main(String[] args) {
        double radius;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        double pi = 3.14;
        double acreage  = 2 * radius * pi;
        double perimeter = pi * radius * radius;

        System.out.println("Acreage is: " + acreage);
        System.out.println("Perimeter is: " + perimeter);
    }
}
