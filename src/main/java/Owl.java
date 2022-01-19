public class Owl {

    private int wingSpan;

    private  boolean hungry;

    private double weight;

    private String name;

    //constructor
    public Owl(int wingSpan, boolean hungry, double weight, String name) {
        this.wingSpan = wingSpan;
        this.hungry = hungry;
        this.weight = weight;
        this.name = name;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean eat(){
        return true;
    }
}
