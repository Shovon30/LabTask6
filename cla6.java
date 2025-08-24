import java.util.Scanner;

public class cla6 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            try {
                long n = sc.nextLong(); // try reading as long

                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                // long is already valid since we read it as long
                System.out.println("* long");

            } catch (Exception e) {
                // If number is too big for a long
                String num = sc.next(); // consume as string
                System.out.println(num + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
