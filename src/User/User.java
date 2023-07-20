package User;
import java.util.Collections;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class User {
    String firstName;
    String secondName;
    int age;
    public User(){}
    public User(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return "First name: " + firstName + " -Second name:" + secondName + " -Age: " + age;
    }
    public void sortByName(List <User> list){
        //first variant for FirstName
        System.out.println("Sort by First Name\n");
        list.sort(comparing(o -> o.firstName));
        list.forEach(System.out::println);
        System.out.println("\n");

    }
    public void sortByAge(List <User> list){
        System.out.println("Sort by Age\n");
        List<User> listSortedByAge = list.stream().sorted((o1,o2) -> o2.age - o1.age).collect(Collectors.toCollection(LinkedList::new));
        listSortedByAge.forEach(System.out::println);
        System.out.println("\n");
    }
    public void averageUsersAge(Collection <User> list){
        double aveAge = list.stream().mapToInt(User::getAge).average().getAsDouble();
        System.out.println("Average age of users: " + aveAge);
        System.out.println("\n");
    }

    public void usersUpperThanEighteen(List <User> list){
        System.out.println("Users upper than 18:");
        List <User> upToEighteen = list.stream().filter(e -> e.age > 18).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(upToEighteen);
        System.out.println("\n");
    }
    public void usersStartSOrA(List <User> list){
        System.out.println("Users with first name letter 'S' or 'A'");
        List <User> firstLetterS = list.stream().filter(e -> e.firstName.charAt(0) == 'S' || e.firstName.charAt(0) == 'A').collect(Collectors.toCollection(LinkedList::new));
        System.out.println(firstLetterS);
        System.out.println("\n\n");
    }

}