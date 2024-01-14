package DisciplineJava_02.Boba;


import DisciplineJava_02.Babo2.Babo;

public class Boba {
    private Babo babo;
    
    // constructor
    
    public void hello(){
        System.out.println(babo.publicInt); // 모든 클래스 이용가능

//        System.out.println(babo.protectedInt); // 자식 클래스도 같은 패키지도 아니라 접근 불가
//        System.out.println(babo.defaultInt); // 같은 패키지가 아니라 접근 불가능
//        System.out.println(babo.privateInt); // 같은 클래스가 아니라 접근 불가능
    }
}

class BaboChild2 extends Babo{
    public void hello(){
        System.out.println(super.publicInt); // 모든 클래스 접근 가능
        System.out.println(super.protectedInt); // 자식클래스라 접근 가능

//        System.out.println(super.defaultInt); // 다른 패키지라 접근 불가능
//        System.out.println(super.privateInt); // 같은 클래스가 아니라 접근 불가능
    }
}