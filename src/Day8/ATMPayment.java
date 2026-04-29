package Day8;

public class ATMPayment implements Payment{
    @Override
    public void makePayment() {
        System.out.println("Payment by ATM");
    }
}
