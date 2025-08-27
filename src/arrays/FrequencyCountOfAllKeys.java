/*Problem 3 (Modified): Count the Frequency of All Elements

Statement:
Given an array arr[] of size n, count the frequency of each distinct element in the array.

Input:

n = 6
arr = [5, 2, 5, 2, 8, 5]


Output:

5 → 3
2 → 2
8 → 1
*/
package arrays;
import java.util.*;

public class FrequencyCountOfAllKeys {

    // Method 1: Using visited array
    public static void frequencyUsingVisited(int[] arr) {
        boolean[] visited = new boolean[arr.length];

        System.out.println("\nFrequencies of all elements (Visited Array Method):");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }

    // Method 2: Using HashMap
    public static void frequencyUsingMap(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nFrequencies of all elements (HashMap Method):");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }

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

        // menu for method choice
        System.out.println("\nChoose method to count frequencies:");
        System.out.println("1. Visited Array Method");
        System.out.println("2. HashMap Method");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            frequencyUsingVisited(arr);
        } else if (choice == 2) {
            frequencyUsingMap(arr);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}


