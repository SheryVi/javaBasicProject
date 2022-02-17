package GroupProject;

public class Task4 {
    public static void main(String[] args) {

        /* Task 4.
        Create a 2D array of integers.
        Develop a program which will calculate the sum of  even and odd numbers for that array.
         */

        int[][] array = {{2, 7, 9, 8}, {3, 6, 1}, {7, 4, 2}};//initialize 2D Array with values
        int sumEven = 0; //initialize int value for sum even numbers
        int sumOdd = 0; //initialize int value for sum odd numbers
        for (int i = 0; i < array.length; i++)  //the loop through array rows
            for (int j = 0; j < array[i].length; j++)//the loop through array values
                if (array[i][j] % 2 == 0) //create condition for even numbers
                    sumEven = sumEven + array[i][j];//perform an addition operation
                    else if (array[i][j]%2!=0)//create condition for odd numbers
                        sumOdd = sumOdd + array[i][j];//perform an addition operation
        {
            System.out.println("The sum of  even numbers is " + sumEven + "\nThe sum of odd numbers is " + sumOdd);
        }     // print the sum even and odd numbers
    }
}

