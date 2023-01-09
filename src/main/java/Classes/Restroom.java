package Classes;

public abstract class Restroom implements IUseRestroom {
    private String  sex;
    private boolean available;
    private boolean clean;

    public Restroom(String mOrF, boolean avail, boolean isItClean){
        this.sex = mOrF;
        this.available = avail;
        this.clean = isItClean;
    }

    @Override
    public String toString() {return "The" + this.sex + "restroom is clean: " + this.clean + " and available " + this.available + ".";}

    @Override
    public void useRestroom() {
        System.out.println("I used the restroom.");
    }

    @Override
    public void washHands() {
        System.out.println("I washed my hands.");
    }
}
