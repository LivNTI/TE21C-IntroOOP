/**
 * class for storing owner info
 */
public class Owner {
    //Attributes
    private String name;
    private Dog myDog;

    /**
    * constructor for the owner
     */
    public Owner(String name){
        this.name= name;
        addDog();
    }

    /**
     * Adds a dog to the owner
     */
    public void addDog(){
        myDog= new Dog("fido", 3);
    }

    /**
     *  Return the name
     */
    public String getName() {
        return name;
    }
}
