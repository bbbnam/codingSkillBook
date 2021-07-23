package chapter1.부정피하기;

import chapter1.sample.Car;

public class BeforeSample {

    private Car car = new Car();

    public String checkCarStatus() {
        if (car.isNotNormal()) {
            return "차가 비정상";
        } else {
            return "차가 정상";
        }
    }
}
