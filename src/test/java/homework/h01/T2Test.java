package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
    private final T2 task = new T2();

    @Test
    void countsOddsForStandardExamples() {
        assertThat(task.countOdds(3, 7)).isEqualTo(3);
        assertThat(task.countOdds(8, 10)).isEqualTo(1);
    }

    @Test
    void returnsZeroForSingleEvenNumber() {
        assertThat(task.countOdds(0, 0)).isEqualTo(0);
    }
}