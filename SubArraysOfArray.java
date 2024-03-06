import java.util.Scanner;

public class SubArraysOfArray {
    public static void main(String[] args) {
        /*
         * [1,2,3]
         * subArrays
         * startIndex endIndex subarray
         * 0 0 {1}
         * 0 1 {1,2}
         * 0 2 {1,2,3}
         * 1 1 {2}
         * 1 2 {2,3}
         * 2 2 {3}
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Provide the size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        // Taking array elements from the user
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        // Displaying array elements
        System.out.print("The array elements are : " + "  ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("The subArrays of given Array : ");
        // Logic to print the subArrays of given array.
        for (int si = 0; si < n; si++) {
            for (int ei = si; ei < n; ei++) {
                System.out.print("{");
                for (int k = si; k <= ei; k++) {
                    // Here I have tried to give braces for each subarray with the following if
                    // condition.
                    if (k == ei) {
                        System.out.print(arr[k]);
                    } else {
                        System.out.print(arr[k] + ",");
                    }
                }
                System.out.print("}");
                System.out.println();
            }
        }
    }
}
