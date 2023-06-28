package Numbers;
import java.util.Arrays;
import java.util.LinkedList;

public class Numbers {
    public void numbers(LinkedList<Integer> numbersCollection, int number) {

        for (int i = 0; i < numbersCollection.size() - 1; i++) {

            for (int j = 0; j < numbersCollection.size() - 1; j++) {

                if (numbersCollection.get(j) >= number) {
                    numbersCollection.add(numbersCollection.remove(j));
                }
            }
        }
        System.out.println("Entered number is " + number);
        System.out.println("Sorted array of collection: " + Arrays.toString(numbersCollection.toArray()));
    }
}
