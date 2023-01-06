public class DutyFree implements IShop {
    private String storeName;
    private boolean open;

    public DutyFree(String storeName, boolean open){
        this.storeName = storeName;
        this.open = open;
    }

    public String getStoreName(){
        return this.storeName;
    }

    public boolean isOpen(){
        return this.open;
    }

    public void setStoreName(String storeName){
        this.storeName = storeName;
    }

    public void setOpen(boolean open){
        this.open = open;
    }

    public void openStore(){
        if(this.open){
            System.out.println(this.storeName + " is open!");
        }else{
            System.out.println(this.storeName + " is closed.");
        }
    }

    @Override
    public void shop(){
        System.out.println("Welcome to " + this.storeName + "!");
    }
    @Override
    public void purchase(){
        System.out.println("Thank you for shopping at " + this.storeName + "!");
    }

}
