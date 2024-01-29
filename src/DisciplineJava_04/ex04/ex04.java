package DisciplineJava_04.ex04;
// 추상 메서드 실습
// abstract 키워드로 나타내며, 메서드 블럭이 없다.
abstract class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    };

    void sayName(){
        System.out.println(name);
        System.out.println(age);
    }

    abstract void sayHello();
}

class Gil extends Person{

    public Gil(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello(){
        System.out.println("Hi!!");
    }
}

class Park extends Person{

    public Park(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello(){
        System.out.println("Hello!");
    }
}

public class ex04 {
    public static void main(String[] args) {
        Gil gil = new Gil("gil", 29);
        Park park = new Park("park", 30);

        gil.sayHello(); // Hi!!!
        park.sayHello(); // Hello!!!

        park.sayName(); // park 30
        gil.sayName(); // gil 29
    }
}
