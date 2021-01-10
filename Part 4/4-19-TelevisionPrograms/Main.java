import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if(name.equals("")){
                break;
            }
            
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            TelevisionProgram televisionProgram = new TelevisionProgram(name, duration);
            programs.add(televisionProgram);
        }

        System.out.print("Program's maximum duration?");
        int maxDuration = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        
        for(TelevisionProgram televisionProgram: programs){
            if(televisionProgram.getDuration() <= maxDuration){
                System.out.println(televisionProgram);
            }
        }

        scanner.close();
    }
}
