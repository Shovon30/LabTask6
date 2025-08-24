import java.util.*;
public class cla9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine(); // consume the leftover newline after double

        String s = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


