package chapter1.쓸모없는_비교_피하기;

public class Car {

    private boolean status = true;

    public boolean isNormal() {
        return status;
    }

    public void changeStatus() {
        if (status) {
            this.status = false;
        }
        this.status = true;
    }
}
