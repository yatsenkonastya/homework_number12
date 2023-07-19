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
        return "FirstName: " + firstName +
                "\nSecondName:" + secondName + "\nAge: " + age;
    }
    public void sortListByName(List <User> list){
        //first variant for FirstName
        System.out.println("Sort by FirstName in right order\n");
        list.sort(comparing(o -> o.firstName));
        list.forEach(System.out::println);
        System.out.println("---------------------------");

        //second variant for SecondName
        System.out.println("Sort by SecondName in reverse order\n");
        list.sort(comparing(o -> o.secondName));
        Collections.reverse(list);
        list.forEach(System.out::println);
        System.out.println("---------------------------");

    }
//    public void sortListByAge(List <User> list){
//        System.out.println("Sort by Age in reversed order\n");
//        List<User> listSortedByAge = list.stream().sorted((o1,o2) -> o2.age - o1.age);
//        listSortedByAge.forEach(System.out::println);
//        System.out.println("---------------------------");
//    }
    public void averageAgeByUsers(Collection <User> list){
        double aveAge = list.stream().mapToInt(User::getAge).average().getAsDouble();
        System.out.println("Average age of users: " + aveAge);
        System.out.println("---------------------------");
    }
    public void usersUpperThanEighteen(List <User> list){
        System.out.println("----Upper than 18------");
        List <User> upToEighteen = list.stream().filter(e -> e.age > 18).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(upToEighteen);
        System.out.println("---------------------------");
    }
    public void usersFirstLetterS(List <User> list){
        System.out.println("----First letter S or A------");
        List <User> firstLetterS = list.stream().filter(e -> e.firstName.charAt(0) == 'S' || e.firstName.charAt(0) == 'A').collect(Collectors.toCollection(LinkedList::new));
        System.out.println(firstLetterS);
        System.out.println("---------------------------");
    }

}