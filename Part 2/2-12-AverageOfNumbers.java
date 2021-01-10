
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            count = count + 1;
            sum = sum + input;
        }

        double average = (1.0 * sum) / count;
        System.out.println("Average of the numbers: " + average);

        // Closing the scanner, so the error disappears
        scanner.close();
    }
}
