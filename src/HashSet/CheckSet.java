package HashSet;

import java.util.*;

public class CheckSet {
    String str;

    public CheckSet(String str) {
        this.str = str;

    }

    public void hashSet() {
        String[] value = str.trim().split(" ");
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(value));
        for (int i = 0; i < value.length - 1; i++) {
            for (int n = i + 1; n < value.length; n++) {
                if (value[i].compareToIgnoreCase(value[n]) == 0) {
                    if (uniqueWords.contains(value[i])) {
                        uniqueWords.remove(value[n]);
                    }
                }
            }
        }
        System.out.println("Test Text: " + str);
        System.out.println("Unique word: " + uniqueWords);
    }
}
