package codewars.sentencesmash;

import java.util.Arrays;
import java.util.List;

public class SmashWords {

    public static String smash(String... words) {
        List<String> wordsAsList = Arrays.asList(words);
        return String.join(" ", wordsAsList);
    }
}
