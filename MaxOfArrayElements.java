import java.util.Scanner;

public class MaxOfArrayElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Assuming the maximum Array element as -infinity that means Interger's minimum
        // value.
        int max = Integer.MIN_VALUE;
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
        // Tranersing the each array element to find the maximum array value.
        // If we find max value then will update the max value with that current maximum
        // value.
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) { // if arr[i] value is greater then the max value then will update the max value
                                // with current element of arr[i].
                max = arr[i];
            }
        }

        System.out.println("The maximum value of this array elements is : " + max);
    }
}
