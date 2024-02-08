import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FarmerTest {

    Farmer farmer;
    Farm farm;
    Chicken koko;
    Chicken rosso;
    Chicken marta;
    Chicken newy;

    @BeforeEach
    public void setUp() {
        farmer = new Farmer("Kolyo");

        koko = new Chicken("Koko",5);
        rosso = new Chicken("Rosso",3);
        marta = new Chicken("Marta",2);
        newy = new Chicken("Newy",0);
        ArrayList<Chicken> chicks = new ArrayList<Chicken>(Arrays.asList(koko,rosso,marta));

        farm = new Farm("Egg Ranch",chicks);
    }

    //GETTER SETTER TEST SUITE
    @Test
    public void canGetName(){
        assertThat(farmer.getName()).isEqualTo("Kolyo");
    }

    @Test
    public void canSetName(){
        farmer.setName("Steve");
        assertThat(farmer.getName()).isEqualTo("Steve");
    }

    @Test
    public void canGetCollectedEggs(){
        assertThat(farmer.getCollectedEggs()).isEqualTo(0);
    }

    @Test
    public void canSetCollectedEggs(){
        farmer.setCollectedEggs(10);
        assertThat(farmer.getCollectedEggs()).isEqualTo(10);
    }

    //METHODS


    @Test
    public void canCollectEggs() {
        farmer.collectEggs(farm);
        assertThat(farmer.getCollectedEggs()).isEqualTo(10);
    }

    @Test
    public void chickenEggsGetCollected() {
        farmer.collectEggs(farm);
        for (Chicken chick : farm.getChickens()){
            assertThat(chick.getEggs()).isEqualTo(0);
        }
    }

    @Test
    public void canAssignEggsForSale() {
        farmer.collectEggs(farm);
        farmer.assignEggsForSale(farm,8);
        assertThat(farm.getEggsForSale()).isEqualTo(8);
        assertThat(farmer.getCollectedEggs()).isEqualTo(2);
    }


}
