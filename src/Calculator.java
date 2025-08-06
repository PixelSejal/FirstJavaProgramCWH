import java.util.Scanner;
public class Calculator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();
        System.out.println("Choose operation:");
        System.out.println("1: + (Addition)");
        System.out.println("2: - (Subtraction)");
        System.out.println("3: * (Multiplication)");
        System.out.println("4: / (Division)");
        System.out.println("5: % (Modulo)");
        int operation = sc.nextInt();

         String result = switch(operation){
            case 1 -> "Result : " + (a+b);
            case 2 -> "Result : " + (a-b);
            case 3 -> "Result : " +(a*b);
            case 4 -> (b != 0) ? "Result: " + (a / b) : "Cannot divide by zero";
             case 5 -> (b != 0) ? "Result: " + (a % b) : "Cannot modulo by zero";
             default -> "Invalid operation!";
         };
        System.out.println(result);
        sc.close();
    }
}
