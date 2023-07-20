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
        return ("Name of this book is " + this.title);
    }
    public void print(){
        System.out.println("One of the books is");
    }
}
