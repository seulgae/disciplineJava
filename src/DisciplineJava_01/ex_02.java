package DisciplineJava_01;

public class ex_02 {
    public static void main(String[] args) {
    // Q1. String, StringBuilder, StringBuffer 세 가지를 알아보고 설명하세요.
 /*
        1) Immutable(불변)
        String은 Immutable(불변)의 성질을 갖고 있다. 객체를 한번 생성하면 할당된 메모리의 공간이 변하지 않고,
        + 연산자 또는 concat 메서드를 통해 기존 생성된 String 객체 문자열에 다른 문자열을 붙여도 기존 문자열에 새로운 문자열을 붙이는 것이 아니라,
        새로운 String 객체를 만든 후, 새로운 Stirng 객체에 연결된 문자열을 저장하고, 그 객체를 참조한다.
        추가) 기존 객체가 제거되면 Java의 가비지 컬렉션이 메모리 공간을 회수한다.
        String 객체는 이러한 이유로 연산이 많은 경우, 성능이 안좋아진다.

        2) Mutable(변함)
        StringBuilder, StringBuffer는 Mutable(변함) 성질을 갖고 있다.
        문자열 연산으로 인해 기존 객체의 공간이 부족해지는 경우, 기존 버퍼 크기를 늘리며 유연하게 동작한다.
        StringBuilder, StringBuffer 클래스의 차이점은 동기화 여부에 있다.

        3) Thread-Safe(스레드-안전) : 여러 스레드로부터 동시에 접근이 이루어져도 프로그램의 실행에 문제가 없음.
        StringBuffer는 각 메서드별로 Synchronized Keyword가 존재하여, 멀티스레드 환경에서도 동기화를 지원하지만
        StringBuilder는 동기화를 보장하지 않는다.

        멀티스레드 환경이라면 동기화 보장을 위해 StringBuffer를 사용하고, 단일 스레드 환경이라면 StringBuilder 사용하는것이 좋다.
 */
    // Q2. JDK8에서 개선된 문자열 더하기 연산의 처리 방식을 알아보고 설명하세요.
/*
        1) StringBuilder
*/

    // Q3. JDK9에서 문자열 처리 속도를 개선하기 위해 사용된 방식을 알아보고 설명하세요.
/*
        1) Compact Strings

        2) Compressed Strings

*/

    }
}
