package exercise;

import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        final int currentYear = 2018;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year of birth: ");
        int birth = sc.nextInt();

        int age = currentYear - birth;
        System.out.println("Your age is: " + age);
    }
}
