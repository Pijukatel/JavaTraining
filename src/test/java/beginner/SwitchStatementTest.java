package beginner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SwitchStatementTest {

    @ParameterizedTest
    @CsvSource({"Monday,true", "Tuesday,true", "Wednesday,true", "Thursday,true", "Friday,true", "Saturday,false", "Sunday, false"})
    void isWorkday(String day, Boolean isWorkday) {
        assertEquals(isWorkday, SwitchStatement.isWorkday(day));
    }

    @Test
    void isWorkdayIllegalArgument(){
        assertThrows(IllegalArgumentException.class, ()->{SwitchStatement.isWorkday("EithDay");});
    }

    @ParameterizedTest
    @CsvSource({"0,0","1,2", "2,2", "3,3", "4,4", "5,0"})
    void localScopeInCase(int controlVariable, int expectedOutput) {
        assertEquals(expectedOutput,SwitchStatement.fallThroughBreakReturn(controlVariable));
    }
}