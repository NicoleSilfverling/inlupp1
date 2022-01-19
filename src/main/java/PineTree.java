import java.util.List;

public class PineTree {

    private int numOfCones;

    private List<Squirrel> squirrels;

    private Owl owl;

    //constructor
    public PineTree(int numOfCones, List<Squirrel> squirrels, Owl owl) {
        this.numOfCones = numOfCones;
        this.squirrels = squirrels;
        this.owl = owl;
    }

    public int getNumOfCones() {
        return numOfCones;
    }

    public void setNumOfCones(int numOfCones) {
        this.numOfCones = numOfCones;
    }

    public List<Squirrel> getSquirrels() {
        return squirrels;
    }

    public void setSquirrels(List<Squirrel> squirrels) {
        this.squirrels = squirrels;
    }

    public Owl getOwl() {
        return owl;
    }

    public void setOwl(Owl owl) {
        this.owl = owl;
    }


    public boolean fall(int height, int age, int windSpeed){
        return true;
    }
}
