
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            numbers.add(input);
        }

        int sum = 0;
        for(Integer number:numbers){
            sum += number;
        }
        double average = 1.0 * sum / numbers.size();
        System.out.println("Average: " + String.valueOf(average));

        // Closing the scanner, so the error disappears
        scanner.close();
    }
}
