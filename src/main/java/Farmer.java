public class Farmer {

    private String name;
    private int collectedEggs;

    public Farmer(String name){
        this.name = name;
        this.collectedEggs = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCollectedEggs() {
        return collectedEggs;
    }

    public void setCollectedEggs(int collectedEggs) {
        this.collectedEggs = collectedEggs;
    }
}
