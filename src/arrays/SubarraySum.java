/*
Problem: Subarray Sum Equals K

Given an integer array nums and an integer k, return the total number of subarrays
whose sum is equal to k.

A subarray is a contiguous part of an array.

Example 1:
Input:
nums = [1,2,3]
k = 3
Output: 2
Explanation: The subarrays are [1,2] and [3].

Example 2:
Input:
nums = [1,1,1]
k = 2
Output: 2
Explanation: The subarrays are [1,1] (first and second) and [1,1] (second and third).

Constraints:
1 <= nums.length <= 2 * 10^4
-1000 <= nums[i] <= 1000
-10^7 <= k <= 10^7
*/

package arrays;

import java.util.*;
public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);   // empty prefix sum

        int count = 0;
        int s = 0;
        for (int x : nums) {
            s += x;
            int need = s - k;
            if (freq.containsKey(need)) {
                count += freq.get(need);
            }
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum (k): ");
        int k = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.subarraySum(nums, k);

        System.out.println("Number of subarrays with sum " + k + " = " + result);

        sc.close();
    }
}
