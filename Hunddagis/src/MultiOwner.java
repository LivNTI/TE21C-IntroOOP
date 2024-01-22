public class MultiOwner extends Owner {
    Dog secondDog;

    public MultiOwner(String name){
        super(name);
    }


    @Override
    public void addDog() {
        super.addDog();
        secondDog= new Dog("spot", 7);
    }
}
