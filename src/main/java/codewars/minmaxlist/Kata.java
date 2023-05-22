package codewars.minmaxlist;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Kata {

    public int min0(int @NotNull [] list) {
        int min_ = list[0];
        for (int i=1; i< list.length; i++){
            min_ = Math.min(min_, list[i]);
        }
        return min_;
    }

    public int max0(int[] list) {
        int max_ = list[0];
        for (int i=1; i< list.length; i++){
            max_ = Math.max(max_, list[i]);
        }
        return max_;
    }

    public int min(int @NotNull [] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}
