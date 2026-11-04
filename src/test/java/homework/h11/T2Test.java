package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
    private final T2 task = new T2();

    @Test
    void returnsMissingNumberForStandardExample() {
        assertThat(task.missingNumber(new int[]{3, 0, 1})).isEqualTo(2);
        assertThat(task.missingNumber(new int[]{0, 1})).isEqualTo(2);
        assertThat(task.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
    }

    @Test
    void returnsZeroWhenOneIsMissing() {
        assertThat(task.missingNumber(new int[]{1})).isEqualTo(0);
    }
}