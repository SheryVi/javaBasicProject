package GroupProject;

public class Task2 {
    public static void main(String[] args) {
        /*Task 2.
        Create a 2D array of integer values. Print the sum of all numbers.
         */

        int [][] array =  {{1,2},{3,4}}; //initialize 2D Array with values
        int sum=0;  //initialize the value "sum" which will be the result of adding all the values of the array

        for (int i = 0; i < array.length; i++) { //loop through all the rows in the array
            for (int j = 0; j < array[i].length; j++) { // loop through array values
                sum += array[i][j]; //perform an addition operation
           }
        }
        System.out.println("The sum of all elements of a 2D Array = "+sum); //print the sum of values to the console
    }
}
