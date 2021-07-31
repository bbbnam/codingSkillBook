package chapter1.common;

public class Car {

    private boolean status = true;
    private boolean unknown = true;
    private String makerName = "hyundai";

    public boolean isNormal() {
        return status;
    }

    public boolean isNotNormal() {
        return status;
    }

    public void changeStatus() {
        if (status) {
            this.status = false;
        }
        this.status = true;
    }

    public void changeUnknown(boolean unknown) {
        this.unknown = unknown;
    }

    public boolean isUnknown() {
        return unknown;
    }

    public boolean isHyundai() {
        if (!unknown && "hyundai".equals(makerName)) {
            return true;
        }
        return false;
    }

    public boolean isKia() {
        if (!unknown && !isHyundai()) {
            return true;
        }
        return false;
    }
}
