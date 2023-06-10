package codewars.betterthanaverage;

import java.util.stream.IntStream;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        IntStream allPoints = IntStream.concat(IntStream.of(classPoints), IntStream.of(yourPoints));
        return (Double.valueOf(yourPoints) > allPoints.average().getAsDouble());
    }
}