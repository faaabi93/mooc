import java.util.ArrayList;

public class Observations {
    private ArrayList<Bird> observations;

    public Observations() {
        this.observations = new ArrayList<>();
    }

    public boolean exists(Bird bird) {
        if(!observations.contains(bird)) {
            return false;
        }
        return true;
    }

    public void add(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        if(!this.exists(bird)) {
            observations.add(bird);
        }
    }

    public void all() {
        for(Bird bird: this.observations) {
            System.out.println(bird);
        }
    }

    public void addObservation(String name) {
        boolean birdFound = false;
        for(Bird bird: this.observations) {
            if(bird.getName().equals(name)) {
                bird.addObservation();
                birdFound = true;
            }
        }
        if(!birdFound) {
            System.out.println("Not a bird!");
        }
    }

    public void one(String name) {
        for(Bird bird: this.observations) {
            if(bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
}
