package Day6;
abstract class Bank
{
   abstract int getRateOfInterest();
   void receipt(){
       System.out.println("print the receipt");
   }
}
class ICICI extends Bank{
    int getRateOfInterest(){
        return 6;
    }
}
class Axis extends Bank
{
    int getRateOfInterest(){
        return 6;
    }
}
public class Abstract {
    public static void main(String[] args){
        Axis a =new Axis();
        System.out.println(a.getRateOfInterest());
        a.receipt();
    }
}
