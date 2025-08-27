/*⭐ Problem 5: Binary Search (Sorted Array)

Statement:
Given a sorted array arr[] of size n and a key x, implement binary search and return the index of x if found, else return -1.

Input:

n = 6
arr = [2, 3, 4, 10, 40, 50]
x = 10


Output:

3*/
package arrays;
import java.util.*;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int x) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // to avoid overflow

            if (arr[mid] == x) {
                return mid;  // element found
            }
            else if (arr[mid] < x) {
                low = mid + 1;  // search right half
            }
            else {
                high = mid - 1; // search left half
            }
        }

        return -1; // element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input array
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // input key
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        // call binary search
        int result = binarySearch(arr, x);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
