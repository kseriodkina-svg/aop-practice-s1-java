package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
    private final T1 task = new T1();

    @Test
    void returnsSameNumberForEvenInput() {
        assertThat(task.smallestEvenMultiple(2)).isEqualTo(2);
        assertThat(task.smallestEvenMultiple(10)).isEqualTo(10);
    }

    @Test
    void returnsDoubledNumberForOddInput() {
        assertThat(task.smallestEvenMultiple(1)).isEqualTo(2);
        assertThat(task.smallestEvenMultiple(5)).isEqualTo(10);
    }
}