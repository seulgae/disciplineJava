package DisciplineJava_03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ex_01 {

    public static void main(String[] args) {
        // Q1. 리스트를 구현해보고 둘의 특징 및 차이, 장단점을 설명해 보세요.

        // ArrayList
        // 특징 : 기본적으로 배열을 사용한다. 하지만 일반 배열과 차이점이 존재한다면,
        //        일반 배열은 처음에 메모리를 할당할 때 크기를 지정해주어야하지만
        //        ArrayList는 크길르 지정하지 않고 동적으로 값을 삽입하고 삭제할 수 있다.
        // 조회 : ArrayList는 각 데이터의 index를 가지고 있고, 무작위 접근이 가능하기 때문에
        //       해당 index의 데이터를 한번에 가져올 수 있다.
        // 데이터 삽입과 삭제 :  데이터의 삽입과 삭제시 ArrayList는 그만큼 위치를 맞춰주어야 한다.
/*  구조
    Array 10[0], 1[1], a[2], 보근[3], 슬개[4] ----> (단방향)

     ex) 5개의 데이터가 있다 가정하자.
         date[0]할라면 나머지 뒤의 4개(data[1], data[2], data[3], data[4])를 앞으로 한칸씩 이동해야한다.
         이처럼 삽입과 삭제가 많다면 ArrayList는 비효율적이다.
*/

        // LinkedList
        // 특징 : 내부적으로 양방향 연결 리스트로 구성되어 있어 참조하려는 원소에 따라 처음부터 정방향 혹은 역순으로 순회 가능.
        //        (배열의 단점을 보완하기 위해 LinkedList가 고안되었다.)
        // 조회 : 순차적 접근이기 때문에 검색의 속도가 느리다.
        // 데이터 삽입과 삭제 : 데이터를 추가&삭제시 가르키고 있는 주소값만 변경해주면 되기 때문에 ArrayList에 비해 상당히 효율적이다.
/*  구조
    Link null -> 10(head) -> 1 -> a -> 보근 -> 슬개(tail) -> null (양방향)
         null <- 10(head) <- 1 <- a <- 보근 <- 슬개(tail) <- null

*/
        // 성능비교해보기
        ArrayList arr = new ArrayList(2000000);
        LinkedList linkArr = new LinkedList();

        // 순차적 추가
        System.out.println("======순차적 추가======");
        System.out.println("ArrayList = " + addArr(arr));
        System.out.println("LinkedList = " + addArr(linkArr));

        // 중간에 추가
        System.out.println("======중간에 추가======");
        System.out.println("ArrayList = " + addMid(arr));
        System.out.println("LinkedList = " + addMid(linkArr));

        // 중간에 삭제
        System.out.println("======중간에 삭제======");
        System.out.println("ArrayList = " + removeMidArr(arr));
        System.out.println("LinkedList = " + removeMidArr(linkArr));

        // 순차적으로 삭제
        System.out.println("======순차적 삭제======");
        System.out.println("ArrayList = " + removeArr(arr));
        System.out.println("LinkedList = " + removeArr(linkArr));

    }


    // ArrayList, LinkedList 순차적 추가
    public static long addArr(List list) {
        long start = System.currentTimeMillis(); // 시작시간
        for (int i = 0; i < 1000000; i++) {
            list.add(i + "");
        }
        long end = System.currentTimeMillis(); // 종료시간
        return end - start; // 시작 - 종료 = 걸린시간
    }

    // ArrayList, LinkedList 중간 추가 메소드
    public static long addMid(List list) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            list.add(500, "a");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // ArrayList, LinkedList 중간 삭제
    public static long removeMidArr(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // ArrayList, LinkedList 순차적 삭제
    public static long removeArr(List list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


/*
    ======순차적 추가======
    ArrayList = 67
    LinkedList = 144
    ======중간에 추가======
    ArrayList = 3646
    LinkedList = 9
    ======중간에 삭제======
    ArrayList = 1461
    LinkedList = 70
    ======순차적 삭제======
    ArrayList = 5
    LinkedList = 19
*/

}
