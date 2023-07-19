import Printable.Book;
import Printable.Magazine;
import Printable.Printable;
import User.User;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        User users = new User();
        List<User> names = Arrays.asList(
                new User("Don", "Dalton", 8),
                new User("Ron", "Joker", 35),
                new User("Anya", "Berta", 9),
                new User("Cem", "Kort", 11),
                new User("Vadim", "Stevenson", 66),
                new User("Kolya", "Largo", 32),
                new User("Stepan", "Voila", 25),
                new User("Stefan", "Portray", 23),
                new User("Andrey", "Knyazev", 23),
                new User("Miha", "Gorsuch", 39)
        );
        users.sortListByName(names);
//        users.sortListByAge(names);
        users.averageAgeByUsers(names);
        users.usersUpperThanEighteen(names);
        users.usersFirstLetterS(names);

        List<Object> printable = Arrays.asList(
                new Book("bookOne"),
                new Book("bookTwo"),
                new Magazine("magazineOne"),
                new Magazine("magazineTwo"),
                new Book("bookThree"));

        Printable lambdaInterface = (list)-> {
            list.forEach(edition -> {
                if (edition instanceof Book) {
                    System.out.println(edition);

                }
                else System.out.println(edition);
            });
            return list;
        };
        System.out.println(lambdaInterface.printable(printable));
        System.out.println("-------------------------------------");


        List<Book> books = Arrays.asList(
                new Book("bookOne"),
                new Book("bookTwo"),
                new Book("bookThree")
        );
        books.forEach(Book::print);

    }
}