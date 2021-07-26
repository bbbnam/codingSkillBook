package chapter1.불_표현식_간소화;

public class BeforeSample {
    private String name;
    private int missionCount;

    public BeforeSample(String name, int missionCount) {
        this.name = name;
        this.missionCount = missionCount;
    }

    public boolean isValid() {
        return missionCount >= 0 && name != null && !name.trim().isEmpty();
    }
}
