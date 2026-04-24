package Day7;


public class Student {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String [] args){
        Student s1 = new Student();
        Student s2 = new Student();
//        s.setName("ram");
//        s.setAddress("ktm");
    }
}
