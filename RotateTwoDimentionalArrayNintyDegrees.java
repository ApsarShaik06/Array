import java.util.Scanner;

public class RotateTwoDimentionalArrayNintyDegrees {
    public static void main(String[] args) {
        /*
         * Input:-
         * 1 2 3 4
         * 5 6 7 8
         * 9 10 11 12
         * 13 14 15 16
         * 
         * Output:-
         * 
         * 13 9 5 1
         * 14 10 6 2
         * 15 11 7 3
         * 16 12 8 4
         */

      /*
        Implementation is 
        1. Given array to Tranpose the array 
        2. Tranpose array to swap each element in a row with last index.

      */
        Scanner s = new Scanner(System.in);
        System.out.println("Provide the row size of array");
        int row = s.nextInt();
        System.out.println("Provide the column size of array");
        int column = s.nextInt();
        int[][] arr = new int[row][column];
        // Taking values from the user.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        // Displaying the array.
        // System.out.println("The given array elements are: ");
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Transposing logic
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i > j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
                // apart from doing this inner for loop, we can use another loop like below.
                // for(int j = 0; j<i; j++){
                // int temp = arr[i][j];
                // arr[i][j] = arr[j][i];
                // arr[j][i] = temp;
                // }
            }
        }

       // swapping each row element.
        for (int i = 0; i < arr.length; i++) {
            int ei = arr[0].length - 1; // Taking the last index value every time while running the loop.
            for (int j = 0; j < arr[0].length; j++) {
                if (j < ei) { // checking that the start index j is less than the end index ei.
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][ei];
                    arr[i][ei] = temp;
                    ei--;
                }
            }

        }

        System.out.println("The 90 degrees Roated 2D array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
