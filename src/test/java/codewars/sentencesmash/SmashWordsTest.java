package codewars.sentencesmash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

public class SmashWordsTest {

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SmashWords.smash(new String[]{"Bilal", "Djaghout"}));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SmashWords.smash(new String[]{}));
    }


    @Test
    public void validateOneWord() {
        assertEquals("Bilal", SmashWords.smash(new String[]{"Bilal"}));
    }

}
