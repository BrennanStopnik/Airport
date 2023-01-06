public abstract class Gate extends Airplane {
    private String gateNumber;
    private String gateType;
    private String gateStatus;

    public Gate(String gateNumber, String gateType, String gateStatus){
        super(100, 1234);
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.gateStatus = gateStatus;
    }

    public String getGateNumber(){
        return this.gateNumber;
    }

    public String getGateType(){
        return this.gateType;
    }

    public String getGateStatus(){
        return this.gateStatus;
    }

    public void setGateNumber(String gateNumber){
        this.gateNumber = gateNumber;
    }

    public void setGateType(String gateType){
        this.gateType = gateType;
    }

    public void setGateStatus(String gateStatus){
        this.gateStatus = gateStatus;
    }

    @Override
    public String toString(){
        return "Gate Number: " + this.gateNumber + " Gate Type: " + this.gateType + " Gate Status: " + this.gateStatus;
    }
}
