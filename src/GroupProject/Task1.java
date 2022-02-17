package GroupProject;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Task 1.
        Create an array on int values using a scanner and calculate the sum of all stored elements in that array.
         */
            Scanner input = new Scanner(System.in); // to rise from the task we need to create a Scanner class
            System.out.println("Enter array length: "); //we will capture the value of the array using the console

            int size = input.nextInt(); //we have to determine the value of the array and convert this value as "size."

            int array[] = new int[size]; //after that we initialize the array with the "size"
            System.out.println("Insert array elements:");//create a command to enter numbers
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();  // after that, the array of values is capture from the console.
            }
            int sum = 0;  //to add all the values we initialize the value int "sum".
            for (int i = 0; i < array.length; i++)  //After that, using the loop, we run through all the values of the array
            sum = sum + array[i];
            System.out.println("The sum of all stored elements of array is: "+ sum); // and output the result to the console
    }
}



