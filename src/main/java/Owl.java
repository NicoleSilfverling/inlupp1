public class Owl {

    private int wingSpan;

    private  boolean hungry;

    //constructor
    public Owl(int wingSpan, boolean hungry) {
        this.wingSpan = wingSpan;
        this.hungry = hungry;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean eat(){
        return true;
    }
}
