/*Problem 2: Find the Second Smallest Element

Statement:
Given an array arr[] of size n, find the second smallest distinct element in the array. If it does not exist, return -1.

Input:

n = 5
arr = [1, 2, 1, 3, 4]


Output:

2
*/
package arrays;
import java.util.*;

public class SecondSmallest {
    public static int secondSmallest(int[] arr) {
        if (arr.length < 2) return -1; // not enough elements

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                second = smallest;
                smallest = num;
            } else if (num < second && num != smallest) {
                second = num;
            }
        }

        return (second == Integer.MAX_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = secondSmallest(arr);
        if (ans == -1) {
            System.out.println("Second smallest element does not exist.");
        } else {
            System.out.println("Second smallest element is: " + ans);
        }

        sc.close();
    }
}
