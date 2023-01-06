public class Airplane extends Passenger implements IBoard{
    private int capacity;
    private int tailNumber;

    public Airplane(int capacity, int tailNumber){
        this.capacity = capacity;
        this.tailNumber = tailNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }
    public int getTailNumber(){
        return this.tailNumber;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setTailNumber(int tailNumber){
        this.tailNumber = tailNumber;
    }
    @Override
    public void boardingStatus() {
        System.out.println("Boarded the plane.");
    }
    @Override
    public void boardingTime() {
        System.out.println("Boarding time starts in 30 minutes.");
    }
}
