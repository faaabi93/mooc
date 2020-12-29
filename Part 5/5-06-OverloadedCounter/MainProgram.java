
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter();
        counter.increase();
        System.out.println(counter);
        counter.increase();
        counter.increase(2);
        System.out.println(counter);
        counter.decrease();
        System.out.println(counter);
        counter.decrease(10);
        System.out.println(counter);
    }
}
