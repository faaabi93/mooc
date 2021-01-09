
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Containers with initial values of 0;
        int first = 0;
        int second = 0;

        while (true) {

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            // Input command and amount:
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if(amount <= 0) {
                // do nothing.
            } else if (command.equals("add")) {
                first += amount;
            } else if (command.equals("move")) {
                if(amount > first) {
                    second += first;
                    first = 0;
                } else {
                    first -= amount;
                    second += amount;
                }
            } else if (command.equals("remove")) {
                second -= amount;
            }

            if(first > 100) {
                first = 100;
            }
            if(second > 100) {
                second = 100;
            } else if (second < 0) {
                second = 0;
            }
        }
    }

}
