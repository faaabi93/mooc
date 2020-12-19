
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("")){
                System.out.println("Age of the oldest: " + String.valueOf(age));
                break;
            }
            String[] splits = input.split(",");
            if(Integer.valueOf(splits[1]) > age){
                age = Integer.valueOf(splits[1]);
            }
        }

    }
}
