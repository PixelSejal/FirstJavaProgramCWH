/*⭐ Problem 10: Remove Duplicates from a Sorted Array

Statement:
Given a sorted array arr[] of size n, remove duplicates in-place and return the new length of the array.

Input:

n = 6
arr = [1, 1, 2, 2, 3, 3]


Output:

3  (Array becomes [1, 2, 3])*/
package arrays;
import java.util.*;
public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 1; // index for next unique element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j; // new length of unique array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input array (must be sorted)
        System.out.println("Enter " + n + " elements (sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // remove duplicates
        int newLength = removeDuplicates(arr);

        // print new length
        System.out.println("\nNew length of array after removing duplicates: " + newLength);

        // print unique elements
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
