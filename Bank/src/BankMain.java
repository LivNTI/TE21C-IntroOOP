public class BankMain {
    public static void main(String[] args) {
        Account acc1= new Account(1, 10);
        Account acc2= new Account(2, 14);

        acc2.changeSum(acc1.getSum()/2);

        acc1.setSum(acc1.getSum()/2);

        System.out.println("Account 1 sum is " + acc1.getSum());
        System.out.println("Account 2 sum is " + acc2.getSum());


        Customer cust= new Customer(1, "Pelle", acc2);

        acc2.setSum(-1000);

        System.out.println("Account 1 sum is " + acc1.getSum() + " and has manager " + acc1.getManager());
        System.out.println("Account 2 sum is " + acc2.getSum());
    }
}
