package DisciplineJava_02.babo;

public class Person {
    private String name; // 필드 변수들
    private int age;
    private String email;
    
    public Person(){    // 기본 생성자 : 컴파일 시점에 자동으로 생성된다.
        // P1. 기본 생성자란 아무 인자도 받지 않는 빈 인스턴스를 생성하는 생성자 함수를 말한다.
    }

    public Person(String name/*this가 붙지 않는 name은 매개 변수로 받아온 애를 가르킨다.*/){ // name만 받는 생성자
        this.name = name; // this가 붙은 name은 자기 자신 인스턴스의 name 즉, Person 객체의 멤버 필드 name을 가르킨다.
    }

/*
    public Person(String name){ // 컴파일 에러 : 같은 클래스 내에 똑같은 메소드 시그니처를 갖는 메소드가 2개 이상 존재할 수 없다.
                                               메소드 시그니처는 메소드 이름과 매개변수 개수, 타입 및 순서로 결정됨.
                                               name만 갖는 email만 갖는 생성자는 같은 메소드 시그니처를 갖기 때문에 동시에 만들 순 없다.
        this.email = email;
    }
*/

    public Person(String name, int age) { // 모든 인자를 포함한 생성자
        // P2. name과 age를 받는 생성자 함수를 정의해줬기 때문에 기본 생성자를 정의해주지 않으면 사용할 수 없다.
        this(name); // 이 경우 1번 생성자 함수를 가르킴
        this.age = age;
    }

    public void sayHello(){ // 메소드
        System.out.println("Hello!!! " + name);
    }
}
