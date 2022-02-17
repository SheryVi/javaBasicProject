package GroupProject;

public class Task5 {
    public static void main(String[] args) {
        /*
        Write a program to swap 2 numbers without a temporary variable?
         */

        int a = 3; //initialize first value
        int b = 6; //initialize second value

        b = a + b; //
        a = b - a;
        b = b - a;

        System.out.println("int a = "+ a +" " + "int b = " + b);


    }
}
