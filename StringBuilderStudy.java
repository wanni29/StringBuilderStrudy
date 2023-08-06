public class StringBuilderStudy {
    public static void main(String[] args) {

        // [사용법과 활용]
        StringBuilder sb = new StringBuilder();

        // 문자열 추가
        sb.append("hello, ");
        sb.append("world!");
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


    }
}
