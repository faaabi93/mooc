
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                
            }
        } catch (Exception e){
            System.out.println("File not found!");
        }
    }

}
