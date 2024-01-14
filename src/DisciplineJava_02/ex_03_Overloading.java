package DisciplineJava_02;

public class ex_03_Overloading {
    String name;
    int age;
    String addr;

    int sum;
    double do_Sum;

    public ex_03_Overloading(){
        // 기본 생성자
    }

    public ex_03_Overloading(String name){
        this.name = name;
    }

    public ex_03_Overloading(String name, int age){
        this.name = name;
        this.age = age;
    }

    public ex_03_Overloading(String name, int age, String addr){
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public static void main(String[] args) {
        // 한 클래스 내에서 이름이 같은 메서드를 사용할 수 있을까?
        // 사용할 수 있다. 어떻게? java Overloading 특성에 의해

        // Overloading(오버로딩)이란?
        // 한 클래스 내에 같은 메서드를 파라미터만 다르게 선언하여 정의할 수 있는 기능이다

        // 오버로딩을 사용하는 이유
        // 1. 메소드 오버로딩을 사용함으로써 메소드에 사용되는 이름을 절약할 수 있다.
        // 2. 동일한 기능의 메서드를 정의할 때 다양한 입력값을 받기 위해서 사용한다.
        // 3. 다형성을 구현할 수 있다.
        // 4. 기본값 지정

        // 같은 메서드라 함은 아래의 조건들이 같은 애들을 의미함
        // 메서드명, 리턴 타입

        // 달라야하는 것
        // 파라미터(매개변수) 인자 갯수

        // 같아도 달라도 상관없는것
        // 접근 지시자, 메소드 블럭

        // 생성자 예제
        ex_03_Overloading overOb4 = new ex_03_Overloading();
        System.out.println(overOb4.name); // null
        System.out.println(overOb4.age); // 0
        System.out.println(overOb4.addr); // null

        ex_03_Overloading overOb1 = new ex_03_Overloading("길태형");
        System.out.println(overOb1.name); // 길태형
        System.out.println(overOb1.age); // 0
        System.out.println(overOb1.addr); // null

        ex_03_Overloading overOb2 = new ex_03_Overloading("길태형", 29);
        System.out.println(overOb2.name); // 길태형
        System.out.println(overOb2.age); // 29
        System.out.println(overOb2.addr); // null

        ex_03_Overloading overOb3 = new ex_03_Overloading("길태형", 29, "파주");
        System.out.println(overOb3.name); // 길태형
        System.out.println(overOb3.age); // 29
        System.out.println(overOb3.addr); // 파주


        // Q1. 오버로딩을 코드로 짜보며 체득하세요.
        ex_03_Overloading overOb5 = new ex_03_Overloading();
        int result = 0;
        double result_Do = 0;

        result = overOb5.seulgae(1); // 서로 같아야하는 조건 : 메서드명
        System.out.println(result);

        result_Do = overOb5.seulgae(1.2324); // 서로 같아야하는 조건 : 리턴타입
        System.out.println(result_Do);

        result = overOb5.seulgae(1, 2); // 서로 달라야하는 조건 : 파라미터 자료형 + 인자 갯수
        System.out.println(result);

        result_Do = overOb5.seulgae(1, 1.5); // 서로 달라야하는 조건 : 파라미터 자료형 + 인자 갯수
        System.out.println(result_Do);

        result_Do = overOb5.seulgae(1, 2, 3.8); // 같아도 달라도 상관없는 조건 : 접근 지시자, 메서드 블럭
        System.out.println(result_Do);

        result = overOb5.seulgae(1, 2, 3); // 같아도 달라도 상관없는 조건 : 접근 지시자, 메서드 블럭
        System.out.println(result);


    }
    // 같은 기능을 하는 같은 이름의 메서드를 작성하자.
    // 1) 서로 같아야하는 조건 : 메서드명, 리턴타입
    int seulgae(int i){
        sum += i;
        return sum;
    }

    // 2) 서로 달라야하는 조건 : 파라미터 자료형 + 인자 갯수
    double seulgae(double i){
        do_Sum += i;
        return do_Sum;
    }

    int seulgae(int i, int y){
        sum += (i+y);
        return sum;
    }

    double seulgae(int i, double y){
        do_Sum += (i+y);
        return do_Sum;
    }

    //3. 같아도 달라도 상관없는 조건 : 접근 지시자, 메서드 블럭
    double seulgae(int i, int y, double z){
        do_Sum += (i+y+z);
        return do_Sum;
    }

    public int seulgae(int i, int y, int z){
        sum += (i+y+z);
        return sum;
    }

}
