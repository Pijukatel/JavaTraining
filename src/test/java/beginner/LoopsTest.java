package beginner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTest {

    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "2,1", "3,4", "4,8", "5,13", "6,13"})
    void sumAllIntsBelowUpTo5AndExclude2(int limitNumber, int expectedSum) {
        assertEquals(expectedSum, Loops.sumAllIntsBelowUpTo5AndExcludeTwoUsingFor(limitNumber));
    }

    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "2,1", "3,4", "4,8", "5,13", "6,13"})
    void sumAllIntsBelowUpTo5AndExcludeTwoUsingWhile(int limitNumber, int expectedSum) {
        assertEquals(expectedSum, Loops.sumAllIntsBelowUpTo5AndExcludeTwoUsingWhile(limitNumber));
    }

    @ParameterizedTest
    @CsvSource({"0,false", "1,True", "12,True", "13,False"})
    void numberInMatrix(int number, Boolean expected) {
        assertEquals(expected, Loops.numberInMatrix(number));
    }
}