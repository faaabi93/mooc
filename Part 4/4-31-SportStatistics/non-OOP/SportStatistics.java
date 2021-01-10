
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/* This file contains the non-OOP solution 
The object-oriented implementation can be found in the other directory */

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;

        try(Scanner scanner = new Scanner(Paths.get(file))) {
            while(scanner.hasNextLine()) {
                String row = scanner.nextLine();

                if(row.isEmpty()){
                    continue;
                }

                String[] parts = row.split(",");
                if((parts[0].equals(team) && (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])))
                || (parts[1].equals(team) && (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])))) {
                    wins++;
                }
                if(parts[0].equals(team) || parts[1].equals(team)){
                    games++;
                }
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
        System.out.println("Games: " + String.valueOf(games));
        System.out.println("Wins: " + String.valueOf(wins));
        System.out.println("Losses: " + String.valueOf(games-wins));

        scan.close();
    }

}
