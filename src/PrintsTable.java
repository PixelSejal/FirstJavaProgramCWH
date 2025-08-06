import java.util.Scanner;
public class PrintsTable {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number of which you want to print table of :");
        int a = sc.nextInt();
        System.out.println("Multiplication Table of " + a + ":");
        for ( int i = 0 ; i <= 10 ; i++){
            System.out.println( a + " x " + i + " = " + (a* i));
        }
        sc.close();
    }
}
