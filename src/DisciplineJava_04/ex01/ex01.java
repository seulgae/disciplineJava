package DisciplineJava_04.ex01;

class Parent{
    public String firstName;
    public final String lastName = "GIL";

    public Parent(String firstName){
        this.firstName = firstName;
    }

    private void sayMyName(String firstName){
        this.firstName = firstName;
    }
}

class Child extends Parent{
    public int age;
    public String child;

    public Child(int age){
        // 부모 클래스에 name을 받는 생성자 함수 밖에 없기 때문에 뭐라도 넣어줘야 한다.
        // Expected 1 arguments but found 0 : 1개의 인수가 필요했지만 0개를 찾았습니다.
        super("슬개"); // super : 조상 멤버와 자신 멤버의 구별에 사용한다.
        this.age = age; // 자식 클래스의 멤버

        System.out.println("첫번째 생성자 호출");
        System.out.println("내 이름은 " + super.firstName + "이고 나이는"+ age + "세 입니다.");
        System.out.println(lastName + "내 성은 호출할 수 있지만 final 상수값이라 변경이 불가능하다.");
    }

    public Child(String firstName,int age){
        super(firstName); // 부모 클래스의 멤버
        this.age = age; // 자식 클래스의 멤버

        System.out.println("두번째 생성자 호출");
        System.out.println("내 이름은 " + firstName + "이고 나이는"+ age + "세 입니다.");
    }

    // private로 설정된 sayMyName() 메서드는 자식인 Child한테 물려주지 않는다.

}
public class ex01 {
    public static void main(String[] args) {
        Child ex01 = new Child(29);
        Child ex01_01 = new Child("슬개", 29);

    }
}
