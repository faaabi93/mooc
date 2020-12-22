import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while(true){
            System.out.print("Title: ");
            String name = scanner.nextLine();

            if(name.equals("")){
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            Book book = new Book(name, pages, year);
            books.add(book);
        }

        //Empy Line for automatic Test ...
        System.out.println("");

        System.out.print("What information will be printed?");
        String input = scanner.nextLine();

        if(input.equals("everything")){
            for(Book book: books){
                System.out.println(book);
            }
        }else if(input.equals("name")){
            for(Book book: books){
                System.out.println(book.getName());
            }
        }
    }
}
