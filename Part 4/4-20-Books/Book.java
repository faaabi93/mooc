public class Book {
    private String name;
    private int pages;
    private int year;

    public Book(String name, int pages, int year){
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public String toString(){
        return this.name + ", " + String.valueOf(this.pages) + " pages, " + this.year; 
    }

    public String getName(){
        return this.name;
    }
}
