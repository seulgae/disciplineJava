package DisciplineJava_02.ex_01;

// Q1.인스턴스 내부 클래스를 정의하고, 사용해보세요.
public class OuterClass { // 외부 클래스
    private int outVal = 100;

    public void printValsOuter(){
        System.out.println("보근 강사 짱짱맨 ~ !");
    }
    public class InnerClass{ // 내부 클래스
        private int inVal = 200;

        public void printValsInner(){
            System.out.println("outVal = " + outVal);
            System.out.println("inVal = " + inVal);

            printValsOuter();
        }
    }
}
