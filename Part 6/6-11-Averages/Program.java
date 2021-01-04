
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // For testing with ui:
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();

        // Test for Part 1:
        /*GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);
        register.addGradeBasedOnPoints(88);

        System.out.println(register.averageOfGrades());*/

        // Test for Part 2:
        /*GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);

        System.out.println(register.averageOfPoints());*/
    }
}
