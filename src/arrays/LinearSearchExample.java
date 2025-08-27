/*⭐ Problem 4: Linear Search

Statement:
Given an array arr[] and a key x, return the index of x if it exists in the array, else return -1.
(Assume 0-based indexing)

Input:

n = 5
arr = [10, 20, 80, 30, 60]
x = 30


Output:

3*/
package arrays;
import java.util.*;

public class LinearSearchExample {
    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;  // element found, return index
            }
        }
        return -1;  // element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        int result = linearSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}

