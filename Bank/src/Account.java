public class Account {
    // Attribute
    private int accNo;
    private String manager= "Emir";
    private double sum;

    // Constructors
    public Account(int accNo, double sum){
        this.accNo= accNo;
        this.sum= sum;

    }

    //methods
    public void changeSum(double change){
        sum= sum+change;
    }

    // getters & setters
    public double getSum(){
        return (this.sum);
    }

    public void setSum(double sum){
        if(sum<0){
            System.out.println("no negative sums");
        }else {
            this.sum = sum;
            System.out.println("sum has been changed");
        }
    }

    public String getManager() {
        return manager;
    }
}











