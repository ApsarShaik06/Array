import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Provide the size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        // Taking array elements from the user
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        // Displaying array elements
        System.out.print("The array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // For Revesing the array, we need to swap the array elements.

        int i = 0; // first value of the array
        int j = n - 1; // last value of the array

        while (i < j) // we need to run this till i < j
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++; // we need to increase the staring index
            j--; // we need to decrease the last index and again we need swap those elements.
        }
        System.out.print("The reverse array is : ");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
