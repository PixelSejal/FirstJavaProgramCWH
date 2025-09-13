/*
📌 Question:
Given an integer array `nums`, return the *running sum* of `nums`.

👉 The running sum is defined as:
runningSum[i] = nums[0] + nums[1] + ... + nums[i].

Example:
Input: nums = [1, 2, 3, 4]
Output: [1, 3, 6, 10]

Input: nums = [1, 1, 1, 1, 1]
Output: [1, 2, 3, 4, 5]

Input: nums = [3, 1, 2, 10, 1]
Output: [3, 4, 6, 16, 17]
*/

package arrays;
import java.util.*;
public class RunningSum {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // first element remains the same
        result[0] = nums[0];

        // build the running sum
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // compute running sum
        RunningSum sol = new RunningSum();
        int[] res = sol.runningSum(nums);

        // print result
        System.out.print("Running Sum: ");
        for (int x : res) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
