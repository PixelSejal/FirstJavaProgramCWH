/*⭐ Problem 1: Find the Second Largest Element in an Array

Statement:
Given an array arr[] of size n, find the second largest distinct element in the array. If it does not exist, return -1.

Input:

n = 6
arr = [12, 35, 1, 10, 34, 1]


Output:

34*/
package arrays;
import java.util.*;

public class SecondLargest {
    public static int secondLargest(int[] arr) {
        if (arr.length < 2) return -1; // not enough elements

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
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

        int ans = secondLargest(arr);
        if (ans == -1) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("Second largest element is: " + ans);
        }

        sc.close();
    }
}

