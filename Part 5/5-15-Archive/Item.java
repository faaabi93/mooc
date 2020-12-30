public class Item {
    private String id;
    private String name;

    public Item(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Item)){
            return false;
        }
        // "Two items should be considered the same if 
        // their identifiers are the same (there can be 
        // variation in their names in different countries,
        // for instance."
        Item comparedItem = (Item) compared;
        return this.id.equals(comparedItem.getId());
    }
}
