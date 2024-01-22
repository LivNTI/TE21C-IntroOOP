import java.util.ArrayList;
import java.util.Scanner;

/**
 * The main system for the daycare
 *
 * @author liv.sundman
 */
public class Hunddagis {
    /**
     * Attributes
     */
    Owner own= new Owner("Owen");
    MultiOwner multi= new MultiOwner("Monique");
    Scanner scan = new Scanner(System.in);

    /**
     * constructor for the daycare
     */
    public Hunddagis(){
        start();
    }

    /**
     * Intitiates the program
     */
    public void start(){

        while(true) {
            System.out.println("Do you want to print the info of Owner(1) or MultiOwner(2)");
            try {
                int val = scan.nextInt();

                if (val == 1) {
                    System.out.println("The owners name is " + own.getName());
                    break;
                } else if (val == 2) {
                    System.out.println("The MultiOwners name is " + multi.getName());
                    break;
                } else {
                    System.out.println("pleas choose 1 or 2");
                }
            }catch (Exception error){
                scan.nextLine();
                System.out.println("please dont write text");
            }
        }









    }
}
