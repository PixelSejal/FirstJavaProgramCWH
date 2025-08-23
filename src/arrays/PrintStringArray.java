package arrays;
import java.util.Scanner;
public class PrintStringArray {
    public void printArray(String[] arr) {
        System.out.println("The words in the array are:");
        for (String word : arr) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }

        PrintStringArray obj = new PrintStringArray();
        obj.printArray(words);

        sc.close();
    }
}
