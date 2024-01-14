package DisciplineJava_02.ex_01;

// Q1.인스턴스 내부 클래스를 정의하고, 사용해보세요.
public class OuterClass { // OuterClass
    private int outVal = 100;
    public class InnerClass{
        private int inVal = 200;

        public void printVals(){
            System.out.println("outVal = " + outVal);
            System.out.println("inVal = " + inVal);
        }
    }
}
