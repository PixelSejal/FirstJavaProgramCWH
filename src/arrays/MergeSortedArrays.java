/*⭐ Problem 11: Merge Two Sorted Arrays

Statement:
Given two sorted arrays arr1[] and arr2[] of sizes n and m, merge them into a single sorted array.

Input:

arr1 = [1, 3, 5, 7]
arr2 = [2, 4, 6, 8]


Output:

[1, 2, 3, 4, 5, 6, 7, 8]*/
package arrays;
import java.util.*;
public class MergeSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < n) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < m) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size of first array
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // input size of second array
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter " + m + " sorted elements:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // merge arrays
        int[] merged = merge(arr1, arr2);

        // print merged sorted array
        System.out.print("\nMerged Sorted Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
