package arrays;
import java.util.Scanner;
public class ArrayLength {
    public static int arrayLength(int[] arr) {
        return arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The length of the array is: " + arrayLength(arr));

        sc.close();
    }
}
