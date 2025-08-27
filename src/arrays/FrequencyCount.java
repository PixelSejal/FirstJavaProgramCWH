/*Problem 3: Count the Frequency of a Given Element

Statement:
Given an array arr[] of size n and a key x, count how many times x occurs in the array.

Input:

n = 6
arr = [5, 2, 5, 2, 8, 5]
x = 5


Output:

3*/
package arrays;
import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // input key
        System.out.print("Enter the element to find frequency: ");
        int key = sc.nextInt();

        // count frequency
        int count = 0;
        for (int num : arr) {
            if (num == key) {
                count++;
            }
        }

        System.out.println(key + " occurs " + count + " times.");
        sc.close();
    }
}
