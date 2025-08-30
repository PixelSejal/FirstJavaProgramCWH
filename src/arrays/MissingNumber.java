/*⭐ Problem 12: Find the Missing Number from 1 to n

Statement:
You are given an array arr[] containing n-1 distinct numbers taken from the range 1 to n. Find the missing number.

Input:

n = 5
arr = [1, 2, 4, 5]


Output:

3*/
package arrays;
import java.util.*;
public class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input n
        System.out.print("Enter n (range 1 to n): ");
        int n = sc.nextInt();

        // input array of size n-1
        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // find missing number
        int missing = findMissing(arr, n);
        System.out.println("Missing Number: " + missing);

        sc.close();
    }
}
