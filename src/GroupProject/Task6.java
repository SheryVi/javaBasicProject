package GroupProject;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Write a java program to check whether a given number is prime or not?
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer to check if it's Prime or not?");
        int input = s.nextInt();

        boolean flag = false;
        for (int i = 2; i <= input / 2; ++i) {
            // condition for nonprime number
            if (input % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(input + " is a prime number.");
        else
            System.out.println(input + " is not a prime number.");
    }
}

