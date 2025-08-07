public class AllPatterns {
        public static void main(String[] args) {

            // Solid Rectangle
            System.out.println("Solid Rectangle:");
            int rows = 4, columns = 5;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Hollow Rectangle
            System.out.println("\nHollow Rectangle:");
            rows = 4; columns = 5;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    if (i == 1 || i == rows || j == 1 || j == columns) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            // Half Pyramid
            System.out.println("\nHalf Pyramid:");
            int n = 4;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Inverted Half Pyramid
            System.out.println("\nInverted Half Pyramid:");
            n = 4;
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Inverted Half Pyramid Rotated by 180 degrees
            System.out.println("\nInverted Half Pyramid Rotated 180°:");
            n = 4;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Half Pyramid with Numbers
            System.out.println("\nHalf Pyramid with Numbers:");
            n = 5;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }

            // Inverted Half Pyramid with Numbers
            System.out.println("\nInverted Half Pyramid with Numbers:");
            n = 5;
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }

            // Floyd's Triangle
            System.out.println("\nFloyd's Triangle:");
            n = 5;
            int a = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(a + " ");
                    a++;
                }
                System.out.println();
            }

            // 0-1 Triangle
            System.out.println("\n0-1 Triangle:");
            n = 5;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }
    }


