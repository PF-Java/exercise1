package exercise;

import java.util.Scanner;

public class ConvertCtoF {
    public static void main(String[] args) {
        float c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter degrees C: ");
        c = sc.nextFloat();

        float f = (9 * c) / 5 + 32;
        System.out.print("Degrees F: " + f);
    }
}
