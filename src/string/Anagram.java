package string;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Step 1: If lengths are different, not an anagram
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 2: Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Step 3: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two lowercase strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("YES, the strings are anagrams.");
        } else {
            System.out.println("NO, the strings are not anagrams.");
        }

        sc.close();
    }
}
