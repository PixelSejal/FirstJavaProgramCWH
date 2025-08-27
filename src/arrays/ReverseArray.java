/*Problem 6: Reverse Array In-Place

Statement:
Given an array arr[] of size n, reverse it in-place.

Input:

n = 5
arr = [1, 2, 3, 4, 5]


Output:

[5, 4, 3, 2, 1]*/
package arrays;
import java.util.*;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
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

        // reverse the array
        reverse(arr);

        // print reversed array
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
