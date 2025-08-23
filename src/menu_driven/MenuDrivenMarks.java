package menu_driven;

import java.util.Scanner;
public class MenuDrivenMarks {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter 1 to input marks or 0 to exit:");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("Enter marks:");
                int marks = sc.nextInt();
                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered.");
                }
            } else if (n != 0) {
                System.out.println("Invalid input. Please enter 1 or 0.");
            }
        } while (n != 0);
        sc.close();

    }

}
