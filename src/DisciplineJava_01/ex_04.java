package DisciplineJava_01;

public class ex_04 {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
    // Q1. 기본형 타입과 참조형 타입을 메소드의 인자로 넘겨보고, 값을 변경해본 뒤에 출력해보세요.
        // 기본형
        int a = 1;
        int b = 2;

        ex_04 xx = new ex_04();
        System.out.println("기본형");
        xx.change(a, b);

        // 참조형
        System.out.println("참조형");
        xx.change(xx.a, xx.b);
    }

    public void change (int a, int b){
        System.out.println("변경전 a : " + a);
        System.out.println("변경전 b : " + b);

        a = 90;
        b = 100;

        System.out.println("변경후 a : " + a);
        System.out.println("변경후 b : " + b);
    }

}
