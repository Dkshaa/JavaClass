package Day8;

public class CreditCardPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Credit card Payment");
    }
}
