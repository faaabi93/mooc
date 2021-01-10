
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        String longestName = "";

        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("")){
                System.out.println("Longest name: " + longestName);
                double average = (1.0 * sum)/count;
                System.out.println("Average of the birth years: " + String.valueOf(average));
                break;
            }
            String[] splitted = input.split(",");
            if(splitted[0].length() > longestName.length()){
                longestName = splitted[0];
            }
            sum += Integer.valueOf(splitted[1]);
            count++;
        }
        scanner.close();
    }
}
