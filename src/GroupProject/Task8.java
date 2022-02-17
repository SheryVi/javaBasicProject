package GroupProject;

public class Task8 {
    public static void main(String[] args) {
            /*
              Maximum and minimum number in the array?
            */
        int[] array = new int[]{5, -8, 100, 2, -12, -100};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        System.out.println("The largest array number is " + max);
        System.out.println("-----------------------------------");
            int min = array[0];
            for (int j = 1; j < array.length; j++) {
                if (array[j] < min)
                    min = array[j];
            }
            System.out.println("The smallest array number is " + min);
        }
}


