
import java.io.*;
import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of tghe array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("It's time to provide the values to the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The values are");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.print("The sum of the array elemts is : " + sum);
    }
}
