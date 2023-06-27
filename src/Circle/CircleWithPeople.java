package Circle;
import java.util.*;

public class CircleWithPeople {
    public CircleWithPeople() {

    }
    public void removePerson(List<Integer> numList) {
        boolean flag = false;
        while (numList.size() != 1) {
            for (int i = 0; i < numList.size(); i++) {
                if (flag) {
                    numList.remove(i--);
                }
                flag = !flag;
            }
        }
        System.out.println("Last person number: " + numList.get(0));
    }
}
