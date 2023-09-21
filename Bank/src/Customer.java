public class Customer {
    // Attribute
    String name;
    int id;
    Account acc;


    //constructor
    public Customer(int id, String name, Account acc){
        this.name= name;
        this.id = id;
        this.acc= acc;

        System.out.println("Pelle has " + acc.sum + " blubb");

    }
}
