import java.util.ArrayList;

public class Farm {

    private String name;
    private ArrayList<Chicken> chickens;
    private int eggsForSale;

    public Farm(String name,ArrayList<Chicken> chickens){
        this.name = name;
        this.chickens = chickens;
        this.eggsForSale = 0;
    }

    //Getters Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public int getEggsForSale() {
        return eggsForSale;
    }

    public void setEggsForSale(int eggsForSale) {
        this.eggsForSale = eggsForSale;
    }

    //METHODS
    public void addChicken(Chicken chicken){
        this.chickens.add(chicken);
    }

    public void removeChicken(Chicken chicken){
        this.chickens.remove(chicken);
    }

    public int countChicken(){
        return this.chickens.size();
    }

}
