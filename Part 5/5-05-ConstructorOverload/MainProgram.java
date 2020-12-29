import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        // Test your class here
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Produkt 1"));
        products.add(new Product("Produkt 2", "Lager"));
        products.add(new Product("Produkt 3", 5)); 

        for(Product product: products){
            System.out.println(product);
        }
    }
}
