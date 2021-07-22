import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class codingTestTest {

    @Test
    public void testSum() {
        int a = 1;
        int b = 1;

        assertThat(a+b).isEqualTo(2);
    }
}
