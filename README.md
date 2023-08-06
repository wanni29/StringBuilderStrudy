# StringBuilder (기본개념)

- 가변성을 가진 문자열을 다루기 위해 사용되는 클래스
- 문자열을 연결하거나 수정할때 String과 비교하였을때, 효율이 높다
- StringBuilder (가변성 : mutable) <--> String(불변성 : immutable)

```java



 public class StringBuilderStudy {
    public static void main(String[] args) {

        // [사용법과 활용]
        StringBuilder sb = new StringBuilder();

        // 문자열 추가
        sb.append("world!");
        sb.append("hello, ");
        System.out.println("결과 1: " + sb.toString());

        System.out.println("=============================");

        // 문자열 추가2
        sb.append(" ").append("My demian is here");


        System.out.println("=============================");

        // 문자열 삽입
        sb.insert(7, "wonderful");
        System.out.println("결과 2: " + sb.toString());

        System.out.println("=============================");

        // 문자열 삭제
        sb.delete(0, 7);
        System.out.println("결과 3: " + sb.toString());

        System.out.println("=============================");

        // 문자열 역순으로 변환
        sb.reverse();
        System.out.println("결과 4: " + sb.toString());

        // 또 다시 역순으로 변환
        sb.reverse();
        System.out.println("결과 5: " + sb.toString());
        System.out.println("=============================");


```
