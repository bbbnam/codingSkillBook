package chapter2.For루프_대신_ForEach;

import java.util.Arrays;
import java.util.List;

public class BeforeSample {

    private final List<String> subjects = Arrays.asList("math", "english", "korean");

    public void showSubjects() {
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("subjects : " + subjects.get(i));
        }
    }

    public static void main(String[] args) {
        BeforeSample sample = new BeforeSample();
        sample.showSubjects();
    }
}
