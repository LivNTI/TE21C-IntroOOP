public class Account {
    // Attribute
    int accNo;
    String manager= "Emir";
    double sum;

    // Constructors
    public Account(int accNo, double sum){
        this.accNo= accNo;
        this.sum= sum;

    }

    public void changeSum(double change){
        sum= sum+change;
    }


}
