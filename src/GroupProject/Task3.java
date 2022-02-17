package GroupProject;

public class Task3 {
    public static void main(String[] args) {

        /* Task 3.
        Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */
        int[][] arr ={{2,7,9},{3,6,1},{7,4,2}}; //initialize 2D Array with values
        for (int i = 0; i < arr.length; i++) { //the loop through all the rows in the array
            for (int j = 0; j < arr[i].length; j++) { //the loop through array values
            if(arr[i][j] %2 ==0){    //create a condition determining even numbers
                System.out.println(arr[i][j] + " "); // print even numbers
            }
        }
    }
}
}