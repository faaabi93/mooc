
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        String name = "name";

        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("")){
                System.out.println("Name of the oldest: " + name);
                break;
            }
            String[] splitted = input.split(",");
            if(Integer.valueOf(splitted[1]) > age){
                age = Integer.valueOf(splitted[1]);
                name = splitted[0];
            }
        }
    }
}
