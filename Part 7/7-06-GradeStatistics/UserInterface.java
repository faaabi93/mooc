import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    // Instance/Class variables
    private Scanner scanner;
    private Points points;

    public UserInterface(Scanner scanner, Points points) {
        this.scanner = scanner;
        this.points = points;
    }

    // Start()-Method for easy implementation in the main method
    public void start() {
        readPoints();
        average();
        passingAverage();
        passPercentage();
        gradeDistribution();
    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");

        while(true) {
            String input = scanner.nextLine();
            int points = Integer.valueOf(input);

            if(points == -1) {
                break;
            }

            if(points >= 0 && points <= 100) {
                this.points.addPoints(points);
            }
        }
    }

    public void average() {
        String toPrint = "-";
        if(this.points.averageAll() != -1.0) {
            toPrint = String.valueOf(this.points.averageAll());
        }
        System.out.println("Point average (all): " +  toPrint);
    }

    public void passingAverage() {
        String toPrint = "-";
        if(this.points.averagePassing() != -1.0) {
            toPrint = String.valueOf(this.points.averagePassing());
        }
        System.out.println("Point average (passing): " + toPrint);
    }

    public void passPercentage() {
        double percentage = this.points.passingPercentage();
        System.out.println("Pass percentage: " + percentage);
    }

    public void gradeDistribution() {
        ArrayList<Integer> list= this.points.gradeList();
        int value = 5;

        System.out.println("Grade distribution");

        while(true) {
            System.out.print(value + ": ");
            for(int grade: list) {
                if(grade == value) {
                    System.out.print("*");
                }
            }
            value--;
            if(value < 0) {
                break;
            }
            System.out.println("");
        }
    }
}
