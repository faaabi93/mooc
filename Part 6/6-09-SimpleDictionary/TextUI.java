import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI (Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if(input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            else if(input.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                this.simpleDictionary.add(word, translation);
            }

            else if(input.equals("search")) {
                System.out.print("To be translated: ");
                String toTranslate = this.scanner.nextLine();
                if(this.simpleDictionary.translate(toTranslate) == null){
                    System.out.println("Word " + toTranslate + " was not found");
                } else {
                    System.out.println("Translation: " + this.simpleDictionary.translate(toTranslate));
                }
            }

            else {
                System.out.println("Unknown command");
            }
        }
    }
}
