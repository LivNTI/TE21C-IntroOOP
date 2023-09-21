public class BankMain {
    public static void main(String[] args) {
        Account acc1= new Account(1, 10);
        Account acc2= new Account(2, 14);

        acc2.changeSum(acc1.sum/2);
        acc1.sum /=2;

        System.out.println("Account 1 sum is " + acc1.sum);
        System.out.println("Account 2 sum is " + acc2.sum);


        Customer cust= new Customer(1, "Pelle", acc2);
    }
}
