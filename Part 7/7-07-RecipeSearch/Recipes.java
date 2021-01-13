
import java.util.ArrayList;

public class Recipes {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients = new ArrayList<>();

    public Recipes (String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        for(String i: ingredients) {
            this.ingredients.add(i);
        }
    }

    public String toString() {
        return "" + this.name + ", cooking time: " + this.cookingTime;
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public boolean nameContains(String string) {
        if(this.name.contains(string)) {
            return true;
        }

        return false;
    }

    public boolean ingredientsContain(String string) {
        for(String i: this.ingredients) {
            if(i.equals(string)) {
                return true;
            }
        }
        return false;
    }
}
