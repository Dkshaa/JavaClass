//package Day6.Abstraction;
//
//interface Payment
//{
//    void pay(double amount);
//    default void transactionInfo(double amount)
//    {
//        validate(amount);
//        System.out.println("Transaction of amount"+amount);
//    }
//
//    private void validate(double amount)
//    {
//        if(amount<=0)
//        {
//            throw new IllegalArgumentException("Invlaid Amount");
//        }
//        System.out.println("Amount validated successfullly");
//    }
//}
//class CrediCard implements Payment
//{
//
//    @Override
//    public void pay(double amount) {
//        // TODO Auto-generated method stub
//        System.out.println("Paid using Credit card"+amount);
//
//    }
//
//}
//class UPI implements Payment
//{
//    @Override
//    public void pay(double amount) {
//        // TODO Auto-generated method stub
//        System.out.println("Paid using UPI card"+amount);
//
//    }
//}
//public class Payment{
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        UPI u=new UPI();
//        u.transactionInfo(10000);
//        u.pay(5000);
//    }
//
//}