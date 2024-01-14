package DisciplineJava_03;
public class ex_02_static {
    public static int age = 10;
    public static void printAge(){
        System.out.println(age);
    }
    public static void main(String[] args) {
        // Q3. 자바의 인스턴스 초기화 블럭을 알아보고 사용해 보세요.
        ex_02_static ivB = new ex_02_static();

        // 인스턴스 초기화 블럭
        System.out.println(ivB.age); // 인스턴스를 통해 정적 멤버 변수에 접근
        ivB.printAge(); // 인스턴스를 통해 정적 메서드 호출
        ivB.age = 20; // 인스턴스를 통해 정적 메서드 값 변경
        ex_02_static.printAge(); // 클래스를 통해 값을 출력
        
        // 스태틱 블럭
        System.out.println(ex_02_static.age); // 클래스를 통해 정적 멤버 변수에 접근
        ex_02_static.printAge(); // 클래스를 통해 정적 메소드 호출
        ex_02_static.age = 30; // 클래스를 통해 정적 메소드 값 변경
        ivB.printAge(); // 인스턴스를 통해 값을 출력

        // 주의.
        // 정적 멤버 변수는 클래스가 로드되는 시점에 메모리를 할당 받는다.
        // 따라서 메모리 사용량이 증가할 수 있다.
        // 클래스 로딩 시점부터 프로그램 종료 시점까지 메모리를 사용하고 있으니 주의하자.

    }
}
