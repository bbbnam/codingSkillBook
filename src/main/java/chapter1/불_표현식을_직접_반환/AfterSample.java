package chapter1.불_표현식을_직접_반환;

public class AfterSample {
    private String name;
    private int missionCount;

    public AfterSample(String name, int missionCount) {
        this.name = name;
        this.missionCount = missionCount;
    }

    public boolean isValid() {
        return missionCount >= 0 && name != null && !name.trim().isEmpty();
    }
}
