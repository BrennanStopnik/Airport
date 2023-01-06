public class Employee {
    private String name;
    private String position;
    private String working;

    public Employee(String empName, String empPosition, String empWorking){
        this.name = empName;
        this.position = empPosition;
        this.working = empWorking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString(){ return this.name + " works as a/an " + this.position + " and is " + this.working + ".";}
}
