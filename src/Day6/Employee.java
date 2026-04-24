package Day6;

abstract class Emplye{
    abstract void work();
        public void eat(){
        System.out.println("Employee eats");
    };
}
class Employeer extends Emplye{
    public void work(){
        System.out.println("Employee works");
    }
}


public class Employee {
    public static void main(String [] args){
        Employeer er = new Employeer();
        er.work();
        er.eat();
    }
}
