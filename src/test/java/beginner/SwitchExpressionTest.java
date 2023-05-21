package beginner;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SwitchExpressionTest {


    @ParameterizedTest
    @CsvSource({"one,1", "uno,1", "two,2", "dos,2", "three,3", "tres,3"})
    void castStringToIntSyntaxWithYield(String numberAsText, int expected) {
        assertEquals(expected, SwitchExpression.castStringToIntSyntaxWithYield(numberAsText));
    }

    @ParameterizedTest
    @ValueSource(strings = {"One", "ONe", "ONE", "oNE", "onE", "oNe"})
    void castStringToIntSyntaxWithYieldCapitalized(String numberAsText) {
        assertEquals(1, SwitchExpression.castStringToIntSyntaxWithYield(numberAsText));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ein", "four"})
    void castStringToIntSyntaxWithYieldIllegalArgument(String numberAsText) {
        assertThrows(IllegalArgumentException.class, () -> {
            SwitchExpression.castStringToIntSyntaxWithYield(numberAsText);
        });
    }

    @ParameterizedTest
    @CsvSource({"one,1", "uno,1", "two,2", "dos,2", "three,3", "tres,3"})
    void castStringToIntSyntaxWithArrow(String numberAsText, int expected) {
        assertEquals(expected, SwitchExpression.castStringToIntSyntaxWithArrow(numberAsText));
    }

    @ParameterizedTest
    @ValueSource(strings = {"One", "ONe", "ONE", "oNE", "onE", "oNe"})
    void castStringToIntSyntaxWithArrowCapitalized(String numberAsText) {
        assertEquals(1, SwitchExpression.castStringToIntSyntaxWithArrow(numberAsText));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ein", "four"})
    void castStringToIntSyntaxWithArrowIllegalArgument(String numberAsText) {
        assertThrows(IllegalArgumentException.class, () -> {
            SwitchExpression.castStringToIntSyntaxWithArrow(numberAsText);
        });
    }
}