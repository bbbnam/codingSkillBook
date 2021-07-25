package chapter1.불_표현식을_직접_반환;

public class BeforeSample {
    private String name;
    private int missionCount;

    public BeforeSample(String name, int missionCount) {
        this.name = name;
        this.missionCount = missionCount;
    }

    public boolean isValid() {
        if (missionCount < 0 || name == null || name.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
