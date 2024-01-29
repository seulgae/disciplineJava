package DisciplineJava_04.ex03;
// 추상 클래스 실습
// 추상 메서드란, 구현체가 없는 메서드
// 사용하기 위해선 구현이 필수이다.
// 1. 클래스 내에서 재정의
// 2. 익명 클래스 내에서 재정의

// 추상 메서드 역시 접근 지시자를 따른다.
// 전 실습에서 언급한 접급 지시자 규칙을 따른다.
abstract class Abstract1 {}

abstract class Abstract2{
    public void sayHello(){
        System.out.println("Hello"); // 추상 메서드 뿐만 아니라, 구현된 메서드를 가질 수도 있다.
    }

    public void sayHello(String greeting){
        System.out.println(greeting); // 오버로딩도 가능하다.
    }

}
abstract class Abstract3{
    abstract void sayHello(); // 추상 메서드, abstract 키워드로 정의 가능하다.

}

public class ex03 {
    public static void main(String[] args) {
        Abstract1 abs1 = new Abstract1() {}; // 구현체가 필수이기 때문에, 아무 것도 없어도 익명 클래스 작성이 필요하다.
        Abstract2 abs2 = new Abstract2() {};
        Abstract2 abs22 = new Abstract2() {
            @Override
            public void sayHello(){
                System.out.println("hi...");
            }
        };

        // 오버라이딩, 오버로딩도 가능하다.
        abs2.sayHello(); // Hello!!!
        abs22.sayHello(); // hi....
        abs2.sayHello("안녕...?"); // 안녕...?

        Abstract3 abs3 = new Abstract3() { // 추상 메서드이기 때문에 구현이 필수이다.
            @Override
            void sayHello() {
                System.out.println("Hi!!!");
            }
        };

        Abstract3 abs33 = new Abstract3() {
            @Override
            void sayHello() {
                System.out.println("Hello....");
            }
        };

        abs3.sayHello(); // Hi!!!!
        abs33.sayHello(); // Hello.......


    }
}
