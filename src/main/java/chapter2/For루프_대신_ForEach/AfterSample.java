package chapter2.For루프_대신_ForEach;

import java.util.Arrays;
import java.util.List;

public class AfterSample {

    private final List<String> subjects = Arrays.asList("math", "english", "korean");

    public void showSubjects() {
        for (String subject : subjects) {
            System.out.println("subjects : " + subject);
        }
    }

    public static void main(String[] args) {
        AfterSample sample = new AfterSample();
        sample.showSubjects();
    }
}
