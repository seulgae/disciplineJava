package DisciplineJava_04.ex01;

public class Parent {
    public String firstName;
    public final String lastName = "Seul";

    public Parent(String firstName){
        this.firstName = firstName;
    }

    private void sayMyName(){
        System.out.println(this.firstName);
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

}
