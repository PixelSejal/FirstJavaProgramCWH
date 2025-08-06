import java.util.Scanner;
public class MonthPrinter {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number of the month: ");
        int no = sc.nextInt();
        String result =  switch (no){
            case 1 -> "JAN";
           case 2 -> "FEB";
            case 3 -> "MAR";
            case 4 -> "APR";
            case 5 -> "MAY";
            case 6 -> "JUN";
            case 7 -> "JUL";
            case 8 -> "AUG";
            case 9 -> "SEP";
            case 10 -> "OCT";
            case 11 -> "NOV";
            case 12 -> "DEC";
            default -> "Invalid month number!";
        };
        sc.close();
        System.out.println(result);
    }
}
