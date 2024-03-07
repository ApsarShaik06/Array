import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        /*
         * Input:-
         * 1 2 3 4
         * 5 6 7 8
         * 9 0 2 3
         * 8 7 1 5
         * 
         * Output:-
         * 
         * 1 5 9 8
         * 2 6 0 7
         * 3 7 2 1
         * 4 8 3 5
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
        System.out.println("The given array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

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

        System.out.println("The Transposed array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
