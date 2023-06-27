package Numbers;
import java.util.Arrays;
import java.util.LinkedList;

public class Numbers {
    public void numbers(LinkedList<Integer> collectionOfInt, int number) {

        for (int i = 0; i < collectionOfInt.size() - 1; i++) {

            for (int j = 0; j < collectionOfInt.size() - 1; j++) {

                if (collectionOfInt.get(j) >= number) {
                    collectionOfInt.add(collectionOfInt.remove(j));
                }
            }
        }
        System.out.println("Entered number is " + number);
        System.out.println("Sorted array of collection: " + Arrays.toString(collectionOfInt.toArray()));
    }
}
