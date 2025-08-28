/*⭐ Problem 8: Rotate Array by K (Right Rotation)

Statement:
Given an array arr[] of size n, rotate the array to the right by k positions.

Input:

n = 5
arr = [1, 2, 3, 4, 5]
k = 2


Output:

[4, 5, 1, 2, 3]
*/
package arrays;
import java.util.*;
public class RightRotateArray {
    // Utility: reverse part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Right rotate by k
    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // handle k > n

        // Step 1: Reverse last k elements
        reverse(arr, n - k, n - 1);

        // Step 2: Reverse first n-k elements
        reverse(arr, 0, n - k - 1);

        // Step 3: Reverse whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // input k
        System.out.print("Enter number of positions to right rotate: ");
        int k = sc.nextInt();

        // rotate
        rightRotate(arr, k);

        // print rotated array
        System.out.println("Array after right rotation by " + k + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
