package Printable;

public class Magazine {
    public String title;

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    public void print(){
        System.out.println("This is Magazine!");
    }
    @Override

    public String toString() {
        return ("This is magazine: " + this.title);
    }

}
