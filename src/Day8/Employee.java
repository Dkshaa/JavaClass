package Day8;

public class Employee {

    String name;
    int salary;
    public Employee(String name, int salary) {
        super();
        this.name = name;
        this.salary = salary;
    }
    public Employee() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }




}