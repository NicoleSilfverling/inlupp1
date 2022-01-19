public class Squirrel {

    private int weight;

    private int numOfConesInNest;

    private int age;

    private String name;

    private boolean hungry;

    //constructor
    public Squirrel(int weight, int numOfConesInNest, int age, String name, boolean hungry) {
        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
        this.age = age;
        this.name = name;
        this.hungry = hungry;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean eat(PineTree pineTree){
        if(hungry && (numOfConesInNest > 0 || pineTree.getNumOfCones() > 0)){
            setWeight(getWeight() + 100);
            return true;
        }
        return false;
    }
}
