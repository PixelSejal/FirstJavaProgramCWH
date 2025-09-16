/*
📌 Question:
Given two sorted arrays nums1 and nums2 of sizes m and n respectively,
return the median of the two sorted arrays.

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.0
Explanation: merged array = [1,2,3] → median = 2

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.5
Explanation: merged array = [1,2,3,4] → median = (2+3)/2 = 2.5

⚠️ Note:
You may assume nums1 and nums2 are both sorted in non-decreasing order.
*/
package arrays;
import java.util.*;
public class MedianOfArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        Arrays.sort(merged);
        int n = merged.length;

        if (n % 2 == 1) {
            return merged[n / 2];   // middle element
        } else {
            int a = merged[n / 2 - 1];
            int b = merged[n / 2];
            return (a + b) / 2.0;   // average of two middles
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input nums1
        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        System.out.println("Enter " + m + " elements (sorted):");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // input nums2
        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter " + n + " elements (sorted):");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // call function and print result
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);

        sc.close();
    }
}
