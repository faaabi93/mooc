
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 100);
    }

    public static void divisibleByThreeInRange(int first, int second){
        while(second >= first){
            if(first%3 == 0){
                System.out.println(first);
            }
            first++;
        }
    }
}
