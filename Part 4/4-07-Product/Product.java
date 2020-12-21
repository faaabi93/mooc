public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuantity){
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }

    public void printProduct(){
        System.out.println("Name: " + this.name + "; Price: " + String.valueOf(this.price) + "; Quantity: " + String.valueOf(this.quantity));
    }
}
