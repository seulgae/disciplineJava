package DisciplineJava_04.ex02;

class Parent{

    public void method01(){

    }
    public void method02(){

    }
    public void method03(){
        System.out.println("Hello");
    }
}

class Child extends Parent{
    public void method01(){ // Parent의 method1()를 재정의 하였다.
        System.out.println("method01 오버라이딩"); //@Override 어노테이션이 없지만 컴파일 에러는 없다.
    }
    /*
    public String method02(){ // Parent의 method02()를 재정의 하였다.
        return "method02 오버라이딩"; // 부모한테 받은 method02() 메서드는 리턴 타입이 다름으로 컴파일 오류
    }
    */
    @Override // 컴파일러에 해당 메서드가 오버라이딩 된 메서드라고 알려주는 어노테이션이다, 굳이 안적어도
    public void method03(){ // Parent의 method03()를 재정의 하였다.
        System.out.println("Haha!!"); // 클래스의 Child 구현체를 갖는 경우 Hello가 아닌 Haha!!출력한다.
    }

    // 접근지시자의 종류 : public > protected > package-private(default) > private
    // 부모의 메서드를 오버라이드 할 때, 부모 메서드의 접근 지시자보다 좁은 범위로 변경이 불가능하다.
/*
    에러 : 'method01()' in 'DisciplineJava_04.ex02.Child' clashes with 'method01()' in 'DisciplineJava_04.ex02.Parent'; attempting to assign weaker access privileges ('private'); was 'public'
    private void method01(){

    }
*/

}

public class ex02{
    public static void main(String[] args) {
        Child ex02 = new Child();
        ex02.method01();
        ex02.method02();
        ex02.method03();
    }
}
