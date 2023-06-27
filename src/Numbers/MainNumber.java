package Numbers;
import java.util.*;
public class MainNumber {
    public static void main(String[] args) {
        Numbers list = new Numbers();
        LinkedList<Integer> collectionOfInt = new LinkedList<>();
        for (int i = 0; i < 25; i++) {
            collectionOfInt.add(i, (int) (Math.random() * 50 - 1));
        }
        System.out.println("Array of collection: " + Arrays.toString(collectionOfInt.toArray()));
        list.numbers(collectionOfInt,23);
    }
}
