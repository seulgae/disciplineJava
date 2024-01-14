package DisciplineJava_02;
public class ex_02 {
    public static void main(String[] args) {
    // Q1. 자바의 연산자들에 대해 알아보세요.
    // 1) 산술연산자
    // + 더하기
        int sum = 1 + 2;
        System.out.println(sum);
    // - 빼기
        int minus = 3 - 1;
        System.out.println(minus);
    // * 곱하기
        int multiply = 3 * 2;
        System.out.println(multiply);
    // / 나누기
        double divide = (double) 3 / (double) 2;
        System.out.println(divide);
    // % 나머지
        double remain = 10 % 2;
        System.out.println(remain);

    // 2) 관계(비교)연산자
    // > 크다
    // < 작다
    // >= 크거나 같다
    // <= 작거나 같다
    // == 같다
    // != 같지 않다.
    // instanceof : 원래 인스턴스 형이 맞는지 여부를 체크하는 키워드, 맞으면 true, 틀리면 false 반환

    // 3) 논리연산자, 비트 연산자
    // &&, & 논리곱(AND) : 피 연산자 모두가 true일 경우에만 연산결과는 true 이다.
    // ||, | 논리합(OR) : 피 연산자 중 하나만 true 이면 true이다.
    // ^ 베타적 논리합(XOR) : 피 연산자 하나는 true 이고 다른 하나가 false 일경우에만 연산 결과는 true 이다.

    // 4) 할당(대입)연산자
    // = : 오른쪽의 값을 왼쪽에 대입한다.
    // += : 오른쪽의 값을 더해주면서 왼쪽에 대입한다.
    // -= : 오른쪽의 값을 빼주면서 왼쪽에 대입한다.
    // *= : 오른쪽의 값을 곱해주면서 왼쪽에 대입한다.
    // /= : 오른쪽의 값을 나누면서 왼쪽에 대입한다.
    // %= : 오른쪽의 값을 나눈 후 나머지를 왼쪽에 대입한다.

    // 5) 삼항연산자
        int a = 0;
        System.out.println(a == 0 ? "맞음": "틀림");
        
    // 6) 단항연산자
    // ++ : 증가 연산자로 항의 값을 1씩 증가시킴.
    // -- : 감소 연산자로 항의 값을 1씩 마이너스 시킴.
    // + : 양수를 표현한다.
    // - : 음수를 표현한다.
    // ! NOT(논리부정) : 피 연산자의 논리값을 바꿈
    // ~ 비트반전연산자 : 비트값을 반전 시킨다.(0->1, 1->0)
    //                 byte, short, int, long 타입만 피연산자가 될 수 있다.

    // Q2. 자바의 연산자들의 우선 순위에 대해 알아보세요.
    // (낮음) 대입 -> 삼항 -> 논리 -> 비교 -> 산술 -> 단항 (높음)
    }
}
