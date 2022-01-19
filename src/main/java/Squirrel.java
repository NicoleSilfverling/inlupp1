public class Squirrel {

    private int weight;

    private int numOfConesInNest;

    //constructor
    public Squirrel(int weight, int numOfConesInNest) {
        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public boolean eat(){
        return true;
    }
}
