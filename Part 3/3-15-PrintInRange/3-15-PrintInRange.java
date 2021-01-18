
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        printNumbersInRange(list, 2, 4);
    };

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int number: numbers){
            if(number <= upperLimit && number >= lowerLimit){
                System.out.println(number);
            }
        }
    }
    
}
