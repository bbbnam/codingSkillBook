package chapter1.부정피하기;

import chapter1.sample.Car;

public class AfterSample {

    private Car car = new Car();

    public String checkCarStatus() {
        if (car.isNormal()) {
            return "차가 정상";
        } else {
            return "차가 비정상";
        }
    }
}
