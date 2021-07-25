### 불 표현식을 직접 반환

- 다음의 복잡한 불 표현식을 2단계에 걸쳐서 변경할 수 있다.
```java
- 기본 
boolean isValid() {
    if (missionCount < 0 || name == null || name.trim().isEmpty()) {
        return false;
    } else {
        return true;
    }
}
```

- 다음 반환을 하기에 앞서 드모르간의 법칙에 대해 알아보자
```
!A && !B == !(A || B) //참
!A || !B == !(A && B) //참
```
- 이렇게 되는 것을 드모르간의 법칙이라고 하는데,   
위의 기본 불 표현식을 조건문을 제거하기 위해 기본 조건의  
부정 조건이 참이 되도록 드모르간의 법칙을 사용하여 보면  
다음과 같이 변경할 수 있다.

```java
- 직접 반환 (1단계)
boolean isValid() {
    return missionCount >= 0 && name != null && !name.trim().isEmpty();
}
```
- 여기까지만 수행해도 불필요한 조건문이 제거되어 훨씬 간결해졌다.
하지만 조건문이 아직도 길다.  
조건문을 세개 이상 합칠 경우에는 나누어 주는 것이 가독성 향상에 도움이 된다.

```java
boolean isValid() {
    boolean isNoMissions = missionCount >= 0;
    boolean isValidName = name != null && !name.trim().isEmpty();
    return isNoMissions && isValidName;
}
```
그런데 불필요한 지역변수를 만들지 않아야 한다는 점에서는 이 부분은  
가독성이 갖는 장점이 클 경우에만 고려해보아야 할 것 같다.
