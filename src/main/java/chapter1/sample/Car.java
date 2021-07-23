package chapter1.sample;

public class Car {

    private boolean status = true;

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
}
