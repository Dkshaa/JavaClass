class Person
{
    void role()
    {
        System.out.println("Person has a role");
    }
}
class Student extends Person
{
    void role(){
        System.out.println("Person is a student");
    }
}
class Employee extends Person{
    void role()
    {
        System.out.println("Person is a Employee");
    }
}

public class Client {
    public static void main(String[] args){
        Person p =new Student();
        p.role();
        p= new Employee();
       p.role();
    }
}
