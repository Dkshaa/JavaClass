package Day8;

//
public class PaymentClient {
        public static void main(String [] args) {
            CreditCardPayment c= new CreditCardPayment();
            ATMPayment a=  new ATMPayment();
            a.makePayment();
            c.makePayment();
            c.transactionLog();
        }
        }
//        List<Employee> emplist= Arrays.asList(
//                new Employee("manasa",9000),
//                new Employee("john",4300),
//                new Employee("harry",94560),
//        );
//        emplist.stream().filter(emp->emp.salary > 5000).map()
//    }
//}
