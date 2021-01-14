import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Observations observations;

    public UserInterface(Scanner scanner, Observations observations) {
        this.scanner = scanner;
        this.observations = observations;
    }

    public void start() {
        while(true) {
            System.out.print("? ");
            String input = scanner.nextLine();
            if(input.equals("Quit")) {
                break;
            }
            if(input.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                observations.add(name, latinName);
            }
            if(input.equals("All")) {
                observations.all();
            }
            if(input.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                observations.addObservation(name);
            }
            if(input.equals("One")) {
                System.out.println("? ");
                String name = scanner.nextLine();
                observations.one(name);
            }
        }
    }
}
