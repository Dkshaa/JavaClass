package Day6;
interface College{
    void study();

}
class Student implements College{
    public void study(){
        System.out.println("Students study");
    }
}

public class InterfaceAbstraction {
    public static void main(String [] args){
        Student s  = new Student();
        s.study();
    }
}
