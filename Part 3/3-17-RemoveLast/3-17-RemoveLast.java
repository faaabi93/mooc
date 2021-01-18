
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
    }
    public static void removeLast(ArrayList<String> strings){
        // Should only work, if the list has elements in it.
        // Other possible solution is an .isEmtpy().check.
        if(strings.size() > 0){
            strings.remove(strings.size()-1);
        } else {
            return;
        }
    }

}
