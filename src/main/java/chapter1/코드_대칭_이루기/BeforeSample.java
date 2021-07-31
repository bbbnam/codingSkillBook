package chapter1.코드_대칭_이루기;

import chapter1.common.Car;

public class BeforeSample {

    private Car car = new Car();

    public void authorize() {
        if (car.isUnknown()) {
            System.out.println("미등록 차량");
        } else if (car.isHyundai()) {
            System.out.println("현대 차량");
        } else if (car.isKia()) {
            System.out.println("기아 차량");
        }
    }
}
