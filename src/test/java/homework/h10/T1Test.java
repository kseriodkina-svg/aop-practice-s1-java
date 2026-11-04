package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
    private final T1 task = new T1();

    @Test
    void returnsCorrectCharacterForExamples() {
        assertThat(task.kthCharacter(5)).isEqualTo('b');
        assertThat(task.kthCharacter(10)).isEqualTo('c');
    }
}