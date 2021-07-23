package chapter1.부정피하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AfterSampleTest {


    private AfterSample afterSample = new AfterSample();

    @Test
    public void afterCheck() {
        assertThat(afterSample.checkCarStatus()).isEqualTo("차가 정상");
    }
}