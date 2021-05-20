import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MetodsLessonTest {

    private static MethodsLesson metodsLesson;

    @BeforeAll
    static void init() {
        metodsLesson = new MethodsLesson();
    }

    @ParameterizedTest
    @MethodSource("dataForNewArrayForFour")
    void newArrayForFour(int[] array, int[] resArray) {
        Assertions.assertArrayEquals(resArray, metodsLesson.newArrayForFour(array));
    }

    public static Stream<Arguments> dataForNewArrayForFour() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 5, 6, 4, 0, 6, 4, 2, 5}, new int[]{2, 5}));
        out.add(Arguments.arguments(new int[]{1, 5, 6, 0, 6, 2, 4}, new int[]{}));
        out.add(Arguments.arguments(new int[]{1, 4, 1}, new int[]{1}));
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForIsOneAndFour")
    void isOneAndFour(int[] array, boolean res) {
        try {
            Assertions.assertEquals(res, metodsLesson.isOneAndFour(array));
        } catch (RuntimeException e) {
            e.getStackTrace();
        }
    }

    public static Stream<Arguments> dataForIsOneAndFour() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 4, 4, 1, 4, 1}, true));
        out.add(Arguments.arguments(new int[]{4, 4, 4}, false));
        out.add(Arguments.arguments(new int[]{1, 1, 1}, false));
        out.add(Arguments.arguments(new int[]{10, 10, 5}, false));
        return out.stream();
    }


}
