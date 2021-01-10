
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        boolean found = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try(Scanner scanner2 = new Scanner(Paths.get(file))){
            while(scanner2.hasNextLine()){
                String row = scanner2.nextLine();
                if(row.equals(searchedFor)){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println("Found!");
            }else{
                System.out.println("Not found.");
            }
        } catch(Exception e){
            System.out.println("Reading the file " + file + " failed");
        }

        scanner.close();
    }
}
