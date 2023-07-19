package Printable;

public class Book {
    public String title;
    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    @Override
    public String toString(){
        return ("This is book: " + this.title);
    }
    public void print(){
        System.out.println("This is book!");
    }
}
