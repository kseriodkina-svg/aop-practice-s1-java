package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
    private final T2 task = new T2();

    @Test
    void reversesStringInPlace() {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        task.reverseString(s1);
        assertThat(s1).containsExactly('o', 'l', 'l', 'e', 'h');
    }
}