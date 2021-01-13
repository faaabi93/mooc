
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points points = new Points();
        
        UserInterface userinterface = new UserInterface(scanner, points);    
        
        userinterface.start();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
