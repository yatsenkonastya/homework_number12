package HashMap;
import java.util.*;


public class CheckMap {
    String text;

    public CheckMap(String str) {
        this.text = str;
    }

    public void hashMap() {
        String[] value = text.trim().split(" ");
        HashMap<String, Integer> counterStr = new HashMap<>();
        for (String word : value) {
            int newValue = counterStr.getOrDefault(word, 0) + 1;
            counterStr.put(word, newValue);

        }
        System.out.println("Test Text: " + text);
        System.out.println("HashMap result: " + counterStr);
    }
}