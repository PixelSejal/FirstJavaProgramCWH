package arrays;
import java.util.*;
public class DecrementArray {
    public static int[] decrementArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 1;
        }
        return arr;
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

        int[] result = decrementArrayElements(arr);
        System.out.println("Array after decrement: " + Arrays.toString(result));

        sc.close();
    }
}
