package DisciplineJava_02.babo;
/*
class Babo{ // 아무 생성자 함수도 정의하지 않는 클래스
    // 아무 생성자 함수도 정의하지 않은 클래스는 기본적으로 기본 생성자를 갖는다.
}
*/
class Babo{
    public void sayName(String name){
        System.out.println("My name is " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        // 객체를 만드는 방법은, 참조형 타입의 변수를 정의한 후 인스턴스를 생성하여 초기화하는 것이 가장 기본적인 방법이다.
        // 인스턴스를 만드는 방법은 new 키워드를 사용해 새성자 함수를 호출하는 것이다.
        // 1. new 키워드와 함께 참조형 타입에 정의도니 생성자 함수를 호출한다.
        // 2. 생성자 함수가 호출되면, 객체를 생성한다.(JVM heep 메모리에 할당된다)
        Person person1 = new Person(); // 기존 생성자를 이용
        // 3. 그 다음 생성자 함수는 객체의 초기화 작업을 수행한다.(필드 변수를 초기화한다.)
        Person person2 = new Person("babo", 20); // all args 생성자를 사용
        // 4. 생성자 함수가 완료되어 객체를 반환한다.
        person2.sayHello(); // Hello!!! babo
        // 5. 반환된 객체는 객체를 참조할 수 있는 변수에 저장된다. (변수에는 객체의 참조값이 할당되며, 해당 변수는 JVM의 스택 영역에 저장된다.


        // Babo 클래스의 sayName()의 경우 다음과 같이 이뤄져 있다.
        // 접근제한자 public
        // returnTepe : void
        // 메서드 명 : sayName
        // 파라미터 : String anmge
        // 메소드 블럭 : {~~~}

        // Babo 타입의 객체를 만들어 멤버 메소드를 사용할 수 있다.
        Babo babo = new Babo();
        babo.sayName("슬개");
    }
}
