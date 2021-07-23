package chapter1.쓸모없는_비교_피하기;

import chapter1.sample.Car;

public class BeForeSample {

    private Car car = new Car();

    public String checkCar() {
        if (car.isNormal() == true) {
            return "차량이 정상입니다.";
        } else {
            return "차량이 정상이 아닙니다.";
        }
    }
}
