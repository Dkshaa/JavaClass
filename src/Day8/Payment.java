package Day8;

public interface Payment {
    public void makePayment();
        default void transactionLog()
        {
            receipt();
            System.out.println("Transaction Operations");
        }
        private void receipt(){
            System.out.println("payment receipt");
    }
}
