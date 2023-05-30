package TestUser;

import javax.jws.soap.SOAPBinding;

public class Main {
    public static void main(String args[]){
        User firstUser = new User();
        firstUser.userName = "Ivan";
        firstUser.setAge(19);
        int ourAge = firstUser.getAge();
        firstUser.email = "user1email@gmail.com";
        firstUser.setPassword("1Userpas");
        firstUser.isActive = Boolean.parseBoolean("True");
        System.out.println("Дані першого користувача: ім'я: " + firstUser.userName + ", вік: " + firstUser.getAge() + ", ел.пошта:" + firstUser.email + ", пароль:" + firstUser.getPassword() + ", чи активний:" + firstUser.isActive);
        firstUser.makePurchase(132);
        firstUser.makePurchase(167);
        firstUser.purchaseOfUser();
        System.out.println("\n");

        User secondUser = new User();
        secondUser.userName = "Yulia";
        secondUser.setAge(16);
        int herAge = secondUser.getAge();
        secondUser.email = "user2email@gmail.com";
        secondUser.setPassword("Mypasso2");
        secondUser.isActive = Boolean.parseBoolean("False");
        System.out.println("Дані другого користувача: ім'я: " + secondUser.userName + ", вік: " + secondUser.getAge() + ", ел.пошта:" + secondUser.email + ", пароль:" + secondUser.getPassword() + ", чи активний:" + secondUser.isActive);
        System.out.println("\n");

        User thirdUser = new User();
        thirdUser.userName = "Vovan";
        thirdUser.setAge(23);
        int hisAge = thirdUser.getAge();
        thirdUser.email = "user3email@gmail.com";
        thirdUser.setPassword("Pass3875");
        thirdUser.isActive = Boolean.parseBoolean("True");
        System.out.println("Дані третього користувача: ім'я: " + thirdUser.userName + ", вік: " + thirdUser.getAge() + ", ел.пошта:" + thirdUser.email + ", пароль:" + thirdUser.getPassword() + ", чи активний:" + thirdUser.isActive);
        thirdUser.makePurchase(345);
        thirdUser.makePurchase(387);
        thirdUser.purchaseOfUser();
        System.out.println("\n");

        User.printTotalAmoundOfSpentMoney();

    }

}