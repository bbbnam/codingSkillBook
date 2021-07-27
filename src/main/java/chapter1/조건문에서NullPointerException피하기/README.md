### 조건문에서 NullPointerException 피하기
- 조건문은 왼쪽에서부터 오른쪽으로 검증을 해간다.
- 그래서 발생할 수 있는 문제가 NullPointerException이 있다.

```java
if (message.trim().isEquals("") || message == null) {
    ...
}
```
- 이런 내용이 있을때 message 내용이 비어 있으면, NullPointerException이 발생할 가능성이 높다.
- 순서를 바꿔서 다음과 같이 하면 null 체크를 먼저 하기 때문에 null 경우에도 먼저 검증이 이루어지게 되어  
  예외는 발생하지 않는다.
  
```java
if (message == null || message.trim().isEquals("")) {
    ...
}
```