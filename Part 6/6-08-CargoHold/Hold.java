import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for(Suitcase item: suitcases) {
            totalWeight += item.totalWeight();
        }
        if(totalWeight + suitcase.totalWeight() <= maxWeight) {
        this.suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for(Suitcase item: this.suitcases) {
            item.printItems();
        }
    }

    public String toString() {
        int weight = 0;
        int counter = 0;

        for(Suitcase suitcase: this.suitcases) {
            weight += suitcase.totalWeight();
            counter++;
        }
        
        return counter + " suitcases (" + weight + " kg)";
    }
}
