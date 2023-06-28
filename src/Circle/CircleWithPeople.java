package Circle;
import java.util.*;

public class CircleWithPeople {
    public CircleWithPeople() {

    }
    public void removePerson(List<Integer> personNumber) {
        boolean flag = false;
        while (personNumber.size() != 1) {
            for (int i = 0; i < personNumber.size(); i++) {
                if (flag) {
                    personNumber.remove(i--);
                }
                flag = !flag;
            }
        }
        System.out.println("Last person number: " + personNumber.get(0));
    }
}
