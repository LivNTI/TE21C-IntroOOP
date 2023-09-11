import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        Scanner myScan= new Scanner(System.in);
        myScan.nextLine();

         */

        //cretae a new dice
        Dice myDice = new Dice();
        Dice myDice2 = new Dice();
        //create a d20
        Dice myD20 = new Dice(20);

        //roll the dice
        myDice.rollDice();
        System.out.println("my dice1 has value "+ myDice.visibleSide);
        myDice2.rollDice();
        System.out.println("my dice2 has value "+ myDice2.visibleSide);
        myD20.rollDice();
        System.out.println("my d20 has value "+ myD20.visibleSide);

    }
}