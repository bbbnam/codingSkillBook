### 불 표현식 간소화

- 이전 단계 (불 표현식을 직접 반환)에서 작성한 내용을 보면
다음과 같다. 
```java
boolean isValid() {
    boolean isNoMissions = missionCount >= 0;
    boolean isValidName = name != null && !name.trim().isEmpty();
    return isNoMissions && isValidName;
}
```
- 나름대로 압축되어 가독성이 증가했지만, 더 리팩토링 할 수 있지 않을까?

```java
boolean isValid() {
    return isNoMissions() && isValidName();
}

boolean isNoMissions() {
    return missionCount >= 0;
}

boolean isValidName() {
    return name != null && !name.trim().isEmpty();
}
```
- 이렇게 메소드로 분리하면 훨씬 가독성이 증가한다.
- 이보다 더 복잡한 코드도 메소드로 분리하면 가독성 증가의 효과가 있다.
(단, 메소드명으로 해당 불 표현식을 잘 나타낼 수 있어야 한다.)