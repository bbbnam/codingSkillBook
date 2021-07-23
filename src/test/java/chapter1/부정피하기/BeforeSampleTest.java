package chapter1.부정피하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BeforeSampleTest {

    private BeforeSample beforeSample = new BeforeSample();

    @Test
    public void beforeCheck() {
        assertThat(beforeSample.checkCarStatus()).isEqualTo("차가 비정상");
    }
}
