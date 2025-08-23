package basics;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        System.out.println("taking input from the user : ");
        Scanner S = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = S.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = S.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = S.nextInt();

        // Output the numbers
        System.out.println("You entered:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);

        S.close();


    }
}
