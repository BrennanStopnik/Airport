public class SmokingZone implements ISmoke {
    private int capacity;
    private String open;

    public SmokingZone(int howBig, String isOpen){
        this.capacity = howBig;
        this.open = isOpen;
    }

    @Override
    public String toString(){
        return "The smoking section can hold " + this.capacity + " and " + this.open + "."
    ;}

    @Override
    public void smoke() {
        System.out.println("I smoked.");
    }
    @Override
    public void smokeTime() {
        System.out.println("I smoked for " + howLong);
    }
}
