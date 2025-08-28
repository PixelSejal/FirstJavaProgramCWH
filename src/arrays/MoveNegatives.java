/*⭐ Problem 9: Move All Negative Numbers to One Side

Statement:
Given an array arr[] of size n, move all negative numbers to the left side of the array, keeping the order of positive numbers intact.

Input:

n = 8
arr = [1, -1, 3, 2, -7, -5, 11, 6]


Output:

[-1, -7, -5, 1, 3, 2, 11, 6]*/
package arrays;
import java.util.*;
public class MoveNegatives {
    public static void moveNegatives(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            // if left is already negative, just move forward
            if (arr[left] < 0) {
                left++;
            }
            // if right is positive, just move backward
            else if (arr[right] >= 0) {
                right--;
            }
            // swap positive at left with negative at right
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
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

        // rearrange array
        moveNegatives(arr);

        // print result
        System.out.println("Array after moving negatives to one side:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
