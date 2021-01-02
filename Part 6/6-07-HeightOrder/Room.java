import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list;

    public Room() {
        this.list = new ArrayList<>();
    }

    public void add(Person person) {
        this.list.add(person);
    }

    public boolean isEmpty() {
        if(this.list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.list;
    }

    public Person shortest() {
        if(this.list.isEmpty()) {
            return null;
        }

        Person shortest = this.list.get(0);
        for(Person person: this.list) {
            if(person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }

        return shortest;
    }

    public Person take() {
        Person shortest = this.shortest();
        this.list.remove(shortest);
        return shortest;
    }
}
