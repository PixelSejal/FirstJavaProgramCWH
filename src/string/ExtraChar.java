package string;
import java.util.*;
public class ExtraChar {
    public static char findExtraChar(String s1, String s2) {
        // Convert both strings to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Convert to char arrays
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare until one mismatch is found
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return arr2[i];  // found the extra character
            }
        }

        // If all matched, extra character is at the end of arr2
        return arr2[arr2.length - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        String s1 = sc.next();
        String s2 = sc.next();

        char result = findExtraChar(s1, s2);
        System.out.println(result);

        sc.close();
    }

}
