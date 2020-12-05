
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else if (input < 0) {
                continue;
            }

            count += 1;
            sum += input;
        }
        if (count == 0) {
            System.out.println("Cannot calculate average");
        } else {
            System.out.println(1.0 * sum / count);
        }

    }
}
