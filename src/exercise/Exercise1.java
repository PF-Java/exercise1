package exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Float physical;
        Float chemistry;
        Float biological;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physical Point: ");
        physical = sc.nextFloat();

        System.out.print("Enter Chemistry Point: ");
        chemistry = sc.nextFloat();

        System.out.print("Enter Biological Point: ");
        biological = sc.nextFloat();

        Float total = physical + chemistry + biological;
        Float average = total / 3;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
