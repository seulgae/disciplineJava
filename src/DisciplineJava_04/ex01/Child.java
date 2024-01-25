package DisciplineJava_04.ex01;

public class Child extends Parent {
    public int age;

    public Child(int age) {
        super("default first name."); // 부모 클래스에 name을 받는 생성자 함수 밖에 없기 때문에 뭐라도 넣어줘야 함.

        this.age = age;
    }

    public Child(String firstName, int age) {
        super(firstName);
        ;

        this.age = age;
    }
}

