
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("First name:");
            String name = String.valueOf(scanner.nextLine());
            if(name.equals("")){
                break;
            }
            System.out.print("Last name:");
            String lastname = String.valueOf(scanner.nextLine());
            System.out.print("Identification number:");
            String id = String.valueOf(scanner.nextLine());

            PersonalInformation personalInformation = new PersonalInformation(name, lastname, id);
            infoCollection.add(personalInformation);
        }
        // Empty line so the automatic test works ...
        System.out.println("");

        for(PersonalInformation element: infoCollection){
            System.out.println(element.getFirstName() + " " + element.getLastName());
        }

    }
}
