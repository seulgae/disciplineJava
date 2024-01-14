package DisciplineJava_01;

import java.math.BigDecimal;

public class ex_01 {
    double a;
    double b;

    public static void main(String[] args) {
    // Q1. 38.25 부동 소수점으로 나타내 보세요.
/*
    (풀이)
    1. 10진수를 2진수로 변환한다.
      10진수 38.25를 2진수로 변환 -> 100110.01
      38 ->  1 0 0 1 1 0
            32 16 8 4 2 1
      0.25 -> 0.25 * 2 -> 0.5 |
              0.5 * 2 ->  1.0 ↓
              .01
      38.25 -> 100110.01
    2. 2진수를 정규화한다.
      1) 38.25를 2진수로 변환하면 100110.01이다.
      2) 변환된 2진수 100110.01을 4바이트 부동 소수점으로 표현하기 위해
         100110.01 -> 1.0011001 다음과 같이 .을 첫번째 자리까지 이동시킨다.
         1.0011001 * 2^5(.을 이동시킨갯수)
    3. 2의 지수를 지수 비트에, 나머지 실수 부분을 가수 비트에 담아 표현할 수 있다.
      1) 부호비트(양수 : 0, 음수 : 1 로 표현함) : 0
      2) 지수부 2^(5) : 127 + 5 = 132 = 1000 0100
      3) 가수부 : 1.(0011001) 이부분 -> 0011001
      참고. 31(부호) 30 ~ 23(지수부) 22 ~ 0(가수부)
      합치면 (부호비트)0 지수부(1000 0100) 가수부(0011001) 나머지는 0으로 채운다.
      0100 0010 0001 1001 0000 0000 0000 0000
*/
    // Q2. 부동 소수점의 부정확성에 대해 알아보고 설명해 보세요.
/*
    1) 연산 순서
      1) 10진수를 2진수로 변환한다.
      2) 2진수를 4바이트 부동 소수점으로 표현하기 위해 정규화 한다.
      3) 정규화된 2진수를 각 부호부, 지수부, 가수부로 결합하여 부동소수점으로 표현한다.
      4) 그리고 연산 결과를 내 친구 보근선생님한테 검사받는다.

    2) 부동 소수점의 부정확성이란?
     컴퓨터 메모리는 한정적이라 실수의 소숫점을 표현할 수 있는 수의 제한이 존재한다.
     ex) 0.25같이 진수 소수점으로 딱 떨어지는 수는 문제없지만
         0.1과 같이 무한으로 반복되는 2진수는 저장할 수 없다.
     다음과 같은 연산처럼
*/
        double a = 12.23;
        double b = 34.45;

        System.out.println(a + b); // 46.68 이 아니라
                                   // 46.68000000000001 바보같은 결과값이 나온다.
/*
    3) 그래서 정확한 실수 계산을 위한 대안으로 Java 제공하는 BigDecimal 클래스를 사용한다.
*/
        BigDecimal goodA = new BigDecimal("12.23");
        BigDecimal goodB = new BigDecimal("34.45");
        BigDecimal goodJob = goodA.add(goodB);
        System.out.println(goodJob);


    // Q3. 본인이 알고있는 내용만으로 기본형 타입과 참조형 타입에 대해 각각 설명해 보세요.

    // 1) Primitive Type(기본형 타입)
    // 기본형 변수는 실제 값을 저장하는 타입
    // 기본형 변수 목록

        // 기본 자료형 변수의 초기화
        // 논리형
        boolean DisciplineYn = false; // 논리형(true, false), 1byte
        if(DisciplineYn == true){ // 기강 여부가 true 값이라면
            System.out.println("기강 잡혔습니다."); // 해당 메세지 출력
        }

        // 문자형
        char discipline = 'A'; // 문자형(''), 2byte
        System.out.println(discipline);

        // 정수형
        byte byteDiscipline = 127; // -128 ~ 127, 1byte
        short shortDiscipline = 32757; // -32768 ~ 32767, 2byte
        int intDiscipline = 2147483647; // -2147483648 ~ 2147483647, 4byte
        long longDiscipline = 922372036854775807L; // -922372036854775808 ~ 922372036854775807, 8byte

        System.out.println(byteDiscipline);
        System.out.println(shortDiscipline);
        System.out.println(intDiscipline);
        System.out.println(longDiscipline);

        // 실수형
        float floatDiscipline = 12.45f; // 1.4E-45 ~ 3.4E38, 4byte
        double doubleDiscipline = 345.24; // 4.9E-324 ~ 1.8E308, 8byte

    // 2) Reference Type(참조형 타입)
    // 참조형 변수는 객체의 주소를 저장한다.
    // 위 8개의 기본형을 제외한 나머지 타입.

        // 참조형 타입변수의 초기화
        ex_01 RefType = new ex_01(); // ex_01 객체를 생성해서, 그 주소를 RefType에 저장.
        RefType.a = 12.23; // iv로 선언된 a변수 전역변수라고도 불리며 초기화해서 사용한다, 메서드 안에 선언된 지역변수랑 다름
        RefType.b = 23.45;

        System.out.println(RefType.a + RefType.b);
    }
}
