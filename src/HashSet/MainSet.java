package HashSet;
import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        String str = "EVERYTHING will be Ukraine everything is Ukraine";
        CheckSet unique = new CheckSet(str);
        unique.hashSet();
    }
}

