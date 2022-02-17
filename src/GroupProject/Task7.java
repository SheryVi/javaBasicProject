package GroupProject;

public class Task7 {
    public static void main(String[] args) {
           /*
			Write a Java Program to print the first 10 numbers of Fibonacci series.
		 */
        int n1=0;
        int n2=1;
        int count=10;

        System.out.println("Fibonacci Series first " + count + " numbers are:");

        for (int i = 1; i <= count; ++i) {
            System.out.print(n1 + " ");

            // compute the next term
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}


