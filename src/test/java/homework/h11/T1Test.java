package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
    private final T1 task = new T1();

    @Test
    void returnsMajorityElementForStandardExample() {
        assertThat(task.majorityElement(new int[]{3, 2, 3})).isEqualTo(3);
        assertThat(task.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }

    @Test
    void returnsElementWhenArrayHasSingleItem() {
        assertThat(task.majorityElement(new int[]{1})).isEqualTo(1);
    }
}