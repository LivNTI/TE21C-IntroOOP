import java.util.Random;

public class Dice {
    //Attributes
    int sides= 6;
    String colour = "white";
    int visibleSide = 1;

    // Constructor
    public Dice(){}

    public Dice(int noSides){ //constructor that changes the sides depending on the input
        sides = noSides;
    }


    // Methods
    public void rollDice(){
        Random rand = new Random();
        visibleSide = rand.nextInt(sides) + 1;

        System.out.println("Dice has been rolled");
    }
}
