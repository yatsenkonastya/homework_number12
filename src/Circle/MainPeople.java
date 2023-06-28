package Circle;
import java.util.*;

public class MainPeople {
    public static void main(String[] args) {
        int N = 73;
        CircleWithPeople people = new CircleWithPeople();
        List<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                arrayList.add(i + 1);
                linkedList.add(i + 1);
            }
            System.out.println(Arrays.toString(arrayList.toArray()));

            long neededTime = System.currentTimeMillis();

            // first variant with arrayList
            people.removePerson(arrayList);
            System.out.println("Needed time for ArrayList: " + ((double) System.currentTimeMillis() - neededTime));

            // second variant with linkedList
            people.removePerson(linkedList);
            System.out.println("Needed time for LinkedList: " + ((double) System.currentTimeMillis() - neededTime));
        } else System.out.println("Something going wrong, please change the number of people and try again!");
    }
}
