package chapter1.불_표현식_간소화;

public class AfterSample {
    private String name;
    private int missionCount;

    public AfterSample(String name, int missionCount) {
        this.name = name;
        this.missionCount = missionCount;
    }

    public boolean isValid() {
        return hasMissions() && isNormalName();
    }

    private boolean hasMissions() {
        return missionCount >= 0;
    }

    private boolean isNormalName() {
        return name != null && !name.trim().isEmpty();
    }
}
