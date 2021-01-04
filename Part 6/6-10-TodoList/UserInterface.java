import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if(input.equals("stop")) {
                break;
            }

            executeCommand(input);
        }
    }

    public void executeCommand(String command) {
        if(command.equals("add")) {
            this.add();
        }else if(command.equals("list")) {
            this.list();
        }else if(command.equals("remove")) {
            this.remove();
        }else{  
            System.out.println("Command not found!");
        }
    }

    public void add() {
        System.out.print("To add: ");
        String task = this.scanner.nextLine();
        todoList.add(task);
    }

    public void list() {
        this.todoList.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int toRemove = Integer.valueOf(this.scanner.nextLine());
        this.todoList.remove(toRemove);
    }
}
