package Dublicate;
import java.util.*;

public class Dublicates {
    public static void main(String[] args) {
        List<Integer> listWithDuplicates = new ArrayList <>();
        List<Integer> listWithoutDuplicates = new ArrayList <>();


        for (int i = 0; i < 100; i++) {
            listWithDuplicates.add(i, (int) (Math.random() * 50 - 1));
        }

        listWithoutDuplicates.add(listWithDuplicates.get(0));
        int count = 0;

        for (int i = 0; i < listWithDuplicates.size() - 1; i++) {
            if (!listWithoutDuplicates.contains(listWithDuplicates.get(i))) {
                listWithoutDuplicates.add(listWithDuplicates.get(i));
            } else count++;
        }

        System.out.println("Collection with duplicates:");
        System.out.println(Arrays.toString(listWithDuplicates.toArray()));

        System.out.println("Collection without duplicates");
        System.out.println(Arrays.toString(listWithoutDuplicates.toArray()));
        System.out.println("Number of duplicates: " + count);
    }
}
