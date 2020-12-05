
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        while(0!=number){
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int count = 0;
        while(count != size){
            printStars(size);
            count++;
        }
    }

    public static void printRectangle(int width, int height) {
        while(height!=0){
            printStars(width);
            height--;
        }
    }

    public static void printTriangle(int size) {
        int start = 0;
        while(start <= size){
            printStars(start);
            start++;
        }
    }
}
