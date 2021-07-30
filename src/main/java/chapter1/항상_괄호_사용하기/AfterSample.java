package chapter1.항상_괄호_사용하기;

public class AfterSample {

    public void check() {
        if (isCorrect()) {
            System.out.println("정확함");
        }

        if (isIncorrect()) {
            System.out.println("정확함");
            System.out.println("부정확함");
        }
    }

    private boolean isCorrect() {
        return true;
    }

    private boolean isIncorrect() {
        return false;
    }
}
