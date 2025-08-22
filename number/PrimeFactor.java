import java.util.Scanner;

class PrimeFactor {
    public static void printPrimeFactorization(int n) {
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        // n must be odd at this point, so we skip even numbers
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // If n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a number to find it's prime factor:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeFactorization(n);
        sc.close();
    }
}

