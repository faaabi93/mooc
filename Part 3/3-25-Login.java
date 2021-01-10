
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        users.add("alex");
        users.add("emma");

        passwords.add("sunshine");
        passwords.add("haskell");

        System.out.print("Enter username: ");
        String user = String.valueOf(scanner.nextLine());
        System.out.print("Enter password: ");
        String password = String.valueOf(scanner.nextLine());

        int i = 0;
        boolean login = false;
        while(i<users.size()){
            if(users.get(i).equals(user) && passwords.get(i).equals(password)){
                System.out.println("You have successfully logged in!");
                login = true;
            }
            i++;
        }
        if(!login){
            System.out.println("Incorrect username or passowrd");
        }
        scanner.close();
    }
}
