
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int input = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int input2 = Integer.valueOf(scanner.nextLine());

        for (int i = input2; i <= input; i++) {
            System.out.println(i);
        }

        // Closing the scanner, so the error disappears
        scanner.close();
    }
}
