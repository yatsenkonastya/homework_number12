package PrintableBookInMagazine;

public class Main {
    public static void main(String[] args) {

        Printable[] printable = {
                new Book("The Great Gatsby"),
                new Book("The Lord Of the Rings"),
                new Magazine("Time"),
                new Magazine("The Week")
        };

        for( Printable edition : printable){
            edition.print();
        }
        System.out.println("Books:");

        Book.printBooks(printable);
        System.out.println("Magazines:");
        Magazine.printMagazines(printable);
    }
}
