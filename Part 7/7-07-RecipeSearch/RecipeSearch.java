
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String input = scanner.nextLine();

        System.out.println("Commands: \nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient");

        ArrayList<Recipes> recipes = readFile(input);
        while(true) {
            System.out.print("Enter command: ");
            String input2 = scanner.nextLine();
            if(input2.equals("stop")) {
                break;
            } else if(input2.equals("list")) {
                for(Recipes r: recipes) {
                    System.out.println(r);
                }

            } else if(input2.equals("find name")) {
                System.out.print("Searched word: ");
                String string = scanner.nextLine();
                findRecipesByName(string, recipes);

            } else if(input2.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                findRecipesByCookingTime(time, recipes);
            } else if(input2.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                findRecipesByIngredient(ingredient, recipes);
            }
        }
        scanner.close();
    }


    public static ArrayList<Recipes> readFile(String input) {
        File file = new File(input);
        ArrayList<Recipes> list = new ArrayList<>();
        ArrayList<String> recipes = new ArrayList<>();

        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(!line.isEmpty()) {
                    recipes.add(line);
                }else{
                    String name = recipes.get(0);
                    int time = Integer.valueOf(recipes.get(1));
                    recipes.remove(0);
                    recipes.remove(0);
                    list.add(new Recipes(name, time, recipes));
                    recipes.clear();
                    
                }
            }
            if(!list.isEmpty()) {
                String name = recipes.get(0);
                int time = Integer.valueOf(recipes.get(1));
                recipes.remove(0);
                recipes.remove(0);
                list.add(new Recipes(name, time, recipes));
                recipes.clear();
            }
        } catch (Exception e) {

        }
        return list;
    }

    public static void findRecipesByName (String string, ArrayList<Recipes> recipes) {
        System.out.println("Recipes: ");
        for(Recipes r: recipes) {
            if(r.nameContains(string)) {
                System.out.println(r);
            }
        }
    }

    public static void findRecipesByCookingTime (int time, ArrayList<Recipes> recipes) {
        System.out.println("Recipes: ");
        for(Recipes r: recipes) {
            if(r.getCookingTime() <= time) {
                System.out.println(r);
            }
        }
    }

    public static void findRecipesByIngredient (String ingredient, ArrayList<Recipes> recipes) {
        System.out.println("Recipes: ");
        for(Recipes r: recipes) {
            if(r.ingredientsContain(ingredient)) {
                System.out.println(r);
            }
        }
    }
}
