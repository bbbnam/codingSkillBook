```java
public class beForeSample {

    private Car car;

    public String checkCar() {
        if (car.isNormal() == true) {
            return "차량이 정상입니다.";
        } else {
            return "차량이 정상이 아닙니다.";
        }
    }
}

```
- 쓸모없는 비교 피하기
- car.isNormal() == true  
  - boolean 표현식은 다른 논리 조건문과 다르게 true나 false와 비교할
필요가 없다. [이렇게 직접 비교하는건 안티패턴이다]
  - if (car.isNormal()) 그냥 이렇게 써주면 된다.