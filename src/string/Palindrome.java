package string;
import java.util.*;
public class Palindrome {

        public static boolean isPalindrome(String str) {
            // code here
            char [] arr = str.toLowerCase().toCharArray();
            int n = arr.length;

            for (int i = 0 ; i<n/2 ; i++){
                if (arr[i]!= arr[n-1-i]){
                    return false;
                }
            }
            return true;
        }
        public static void main (String[] args){
            Scanner sc = new Scanner (System.in);
            String str = sc.nextLine();
            System.out.println(isPalindrome(str));
            sc.close();
        }
    }

