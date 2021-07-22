package chapter1.쓸모없는_비교_피하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AfterSampleTest {

    private AfterSample sample = new AfterSample();

    @Test
    void afterSampleTest() {
        assertThat(sample.checkCar()).isEqualTo("차량이 정상입니다.");
    }
}
