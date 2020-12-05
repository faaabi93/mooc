
public class AdvancedAstrology {

    public static void printStars(int number) {
        while(0!=number){
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        while(number != 0){
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        int stars = 1;
        while(size != 0){
            size--;
            printSpaces(size);
            printStars(stars);
            stars++;
        }
    }

    public static void christmasTree(int height) {
        int stars = 1;
        int hight2 = height;
        while(hight2 != 0){
            hight2--;
            printSpaces(hight2);
            printStars(stars);
            stars = stars + 2;
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
