package beginner;

import org.jetbrains.annotations.NotNull;

public class SwitchExpression {

    public static int castStringToIntSyntaxWithYield(@NotNull String numberAsText) {
        int number = switch (numberAsText.toLowerCase()) {
            case "one":
            case "uno":
                yield 1;
            case "two":
            case "dos":
                yield 2;
            case "three":
            case "tres":
                yield 3;
            default:
                throw new IllegalArgumentException("Unsupported text representation of number.");
        };
        return number;
    }

    public static int castStringToIntSyntaxWithArrow(@NotNull String numberAsText) {
        int number = switch (numberAsText.toLowerCase()) {
            case "one", "uno" -> 1;
            case "two", "dos" -> 2;
            case "three", "tres" -> 3;
            default -> throw new IllegalArgumentException("Unsupported text representation of number.");
        };
        return number;
    }
}
