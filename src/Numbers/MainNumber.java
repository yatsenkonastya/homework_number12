package Numbers;
import java.util.*;
public class MainNumber {
    public static void main(String[] args) {
        Numbers list = new Numbers();
        LinkedList<Integer> numbersCollection = new LinkedList<>();
        for (int i = 0; i < 25; i++) {
            numbersCollection.add(i, (int) (Math.random() * 50 - 1));
        }
        System.out.println("Array of collection: " + Arrays.toString(numbersCollection.toArray()));
        list.numbers(numbersCollection,23);
    }
}
