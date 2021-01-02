import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if(this.totalWeight() + item.getWeight() <= maxWeight){
            this.items.add(item);
        }
    }

    public void printItems() {
        for(Item item: this.items) {
            System.out.println(item.toString());
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for(Item item: items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for(Item item: this.items) {
            if(item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }

        return heaviestItem;
    }

    public String toString() {
        int counter = 0;
        int weight = 0;
        for(Item item: items) {
            weight += item.getWeight();
            counter++;
        }
        if(counter == 0) {
            return "no items (" + weight + " kg)";
        } else if (counter == 1) {
            return "1 item (" + weight + " kg)";
        } else {
            return counter + " items (" + weight + " kg)";
        }
    }
}
