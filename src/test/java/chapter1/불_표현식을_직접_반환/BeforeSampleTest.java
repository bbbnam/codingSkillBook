package chapter1.불_표현식을_직접_반환;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BeforeSampleTest {

    @DisplayName("missionCount가 0보다 작거나 이름값이 비어있으면, 유효성 검사가 실패(false)한다.")
    @Test
    void isValid() {
        BeforeSample beforeSample = new BeforeSample("대충지은이름", -1);

        assertThat(beforeSample.isValid()).isFalse();
    }
}
