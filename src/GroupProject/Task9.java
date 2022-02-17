package GroupProject;

public class Task9 {
    public static void main(String[] args) {
		/*
			Write a java program to find the second largest number in the array?
		 */
        int[] numbers = {2,27,35,43,99,1999};

        for(int i = 0; i<numbers.length; i++ ){
            for(int j = i + 1; j<numbers.length; j++){
                if(numbers[i]>numbers[j]){
                            int temp = numbers[i];
                            numbers[i] = numbers[j];
                            numbers[j] = temp;
                        }
                    }
                }
                System.out.println("The second largest number in the array is: "+ numbers[numbers.length-2]);

            }
        }
