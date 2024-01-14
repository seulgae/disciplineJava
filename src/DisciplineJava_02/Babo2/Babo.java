package DisciplineJava_02.Babo2;

public class Babo {
    public int publicInt;
    protected int protectedInt;
    int defaultInt;

    public void sayName(String 슬개) {
    }
//    private int privateInt;
}

class BaboChild1 extends Babo{
    public void hello(){
        System.out.println(super.publicInt); //
        System.out.println(super.protectedInt);
        System.out.println(super.defaultInt);

//        System.out.println(super.privateInt);
    }
}
