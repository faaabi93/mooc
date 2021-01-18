
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        double sqrt = Math.sqrt(first + second);
        System.out.println(sqrt);

        // Closing the scanner, so the error disappears
        scanner.close();
    }
}
