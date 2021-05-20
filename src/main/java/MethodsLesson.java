import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MethodsLesson {
    public int[] newArrayForFour(int[] array) throws RuntimeException {
        final int x = 4;

        int index = lastIndexNumber(array, x) + 1;
        if (index > 0) {
            int[] newArray = new int[array.length - index];
            System.arraycopy(array, index, newArray, 0, array.length - index);
            return newArray;
        } else {
            throw new RuntimeException("Массив не имеет числа " + x);
        }
    }

    private int lastIndexNumber(int[] array, int x) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
            }
        }
        return index;
    }

    public boolean isOneAndFour(int[] array) {
        final int X1 = 1;
        final int X4 = 4;
        return (Arrays.stream(array).anyMatch(v -> v == X1) &&
                Arrays.stream(array).anyMatch(v -> v == X4));
    }
}