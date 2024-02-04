package DisciplineJava_04.ex05;
// 인터페이스 실습
// 인터페이스란 -> 추상 클래스보다 좀 더 추상적인 개념이 인터페이스이다.

interface Person{
    void hello();

    default void bye(){   // default 메서드로, 따로 재정의하지 않으면 해당 구현을 따라 동작함.
        System.out.println("bye~!");
        sayGoodBye();
    }

    private void sayGoodBye(){
        System.out.println("jdk8부터 private 메서드를 가질 수 있게 되었다.");
    }
    // 디폴트 메서드는 구현체를 가질 수 있으며, 구현체들이 해당 메서드를 따로 구현하지 않고 사용할 수 있다.
}

interface Cleaner{
    void cleaning();
}

interface Cook{
    void cooking();
}

class Gil implements Person, Cook{ // implements 키워드를 통해 구현한다.
    // 상속이 아니기 때문에 여러 개의 인터페이스를 구현할 수도 있다.
    // 인터페이스의 추상 메서드는 기본적으로 public이며, public 접근 지시자만을 가질 수 있다.
    // 역시 위에서 언급한 오버라이딩의 접근 지시자 규칙을 따르기 때문에
    // 인터페이스의 추상 메서드를 구현한 메서드는 무조건 public이다.
    @Override
    public void hello(){
        System.out.println("Hello");
    }

    @Override
    public void cooking(){
        System.out.println("cooking...");
    }
}
public class ex05 {
    public static void main(String[] args) {
        Gil gil = new Gil();
        Cleaner park = new Cleaner() { // park처럼 Cleaner 인터페이스를 익명 클래스로 구현해 사용할 수도 있다.
            // 이 경우 추상 클래스와 마찬가지로 추상 메서드를 모두 구현해줘야 한다.
            @Override
            public void cleaning() {
                System.out.println("cleaning..");
            }
        };

        gil.hello(); // Hello
        gil.cooking(); // cooking...
        gil.bye(); // bye~!
        park.cleaning(); //cleaning..
    }
}
