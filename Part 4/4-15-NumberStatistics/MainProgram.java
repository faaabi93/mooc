
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

        Statistics numbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();

        while(true){
            System.out.println("Enter numbers:");
            int input = Integer.valueOf(scanner.nextLine());

            if(input == -1){
                System.out.println("Sum: " + String.valueOf(numbers.sum()));
                System.out.println("Sum of even numbers: " + String.valueOf(evenNumbers.sum()));
                System.out.println("Sum of odd numbers: " + String.valueOf(oddNumbers.sum()));
                break;
            }

            numbers.addNumber(input);

            if(input % 2 == 0){
                evenNumbers.addNumber(input);
            } else {
                oddNumbers.addNumber(input);
            }
        }
    }
}
