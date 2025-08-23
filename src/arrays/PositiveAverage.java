package arrays;
import java.util.*;
public class PositiveAverage {
    public static double posAverage(int[] arr) {
        int sum = 0, count = 0;
        for (int x : arr) {
            if (x >= 0) {
                sum += x;
                count++;
            }
        }
        return count == 0 ? 0.0 : (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Average of positive elements is: " + posAverage(arr));

        sc.close();
    }
}
