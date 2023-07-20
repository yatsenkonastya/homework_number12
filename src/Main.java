import Printable.Book;
import Printable.Magazine;
import Printable.Printablle;
import User.User;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        User users = new User();
        List<User> names = Arrays.asList(
                new User("Stas", "Wales", 16),
                new User("Harry", "Potter", 22),
                new User("Ron", "Wizzly", 15),
                new User("Draco", "Malfoy", 25),
                new User("Viola", "Jones", 11),
                new User("Asya", "Yatsenko", 23),
                new User("Victoria", "Rosso", 82),
                new User("Nicola", "Dobrev", 56),
                new User("Vanya", "Kariton", 14),
                new User("Olesya", "Second", 17)
        );
        users.sortByName(names);
        users.sortByAge(names);
        users.averageUsersAge(names);
        users.usersUpperThanEighteen(names);
        users.usersStartSOrA(names);

        List<Object> printable = Arrays.asList(
                new Book("The Great Gatsby"),
                new Book("The Bible"),
                new Magazine("Phoenix"),
                new Magazine("The National Trust"));
//                new Book("bookThree"));


        Printablle lambdaInterface = (list)-> {
            list.forEach(edition -> {
                if (edition instanceof Book) {
                    System.out.println(edition);

                }
                else System.out.println(edition);
            });
            return list;
        };
        System.out.println(lambdaInterface.printable(printable));
        System.out.println("\n");


        List<Book> books = Arrays.asList(
                new Book("firstBook"),
                new Book("secondBook")
        );
        books.forEach(Book::print);

        List<Magazine> magazines = Arrays.asList(
                new Magazine("firstMagazine"),
                new Magazine("secondMagazine")
        );
        magazines.forEach(Magazine::print);

    }
}