import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FarmTest {

    Farm farm;
    Chicken koko;
    Chicken rosso;
    Chicken marta;
    Chicken newy;

    @BeforeEach
    public void setUp() {
        koko = new Chicken("Koko",5);
        rosso = new Chicken("Rosso",3);
        marta = new Chicken("Marta",2);
        newy = new Chicken("Newy",0);
        ArrayList<Chicken> chicks = new ArrayList<Chicken>(Arrays.asList(koko,rosso,marta));

        farm = new Farm("Egg Ranch",chicks);
    }

    //GETTER SETTER TEST SUITE
    @Test
    public void hasName() {
        assertThat(farm.getName()).isEqualTo("Egg Ranch");
    }

    @Test
    public void canSetName() {
        farm.setName("Egg Factory");
        assertThat(farm.getName()).isEqualTo("Egg Factory");
    }

    @Test
    public void canGetChickens() {
        assertThat(farm.getChickens()).isEqualTo(Arrays.asList(koko,rosso,marta));
    }

    @Test
    public void canSetChickens(){
        
        ArrayList<Chicken> newChicks = new ArrayList<>(Arrays.asList(newy));
        farm.setChickens(newChicks);
        assertThat(farm.getChickens()).isEqualTo(Arrays.asList(newy));
    }

    @Test
    public void canGetEggsForSale() {
        assertThat(farm.getEggsForSale()).isEqualTo(0);
    }

    @Test
    public void canSetEggsForSale() {
        farm.setEggsForSale(10);
        assertThat(farm.getEggsForSale()).isEqualTo(10);
    }

    //METHODS

    @Test
    public void canAddChicken() {
        farm.addChicken(newy);
        assertThat(farm.getChickens().size()).isEqualTo(4);
    }

    @Test
    public void canRemoveChicken() {
        farm.removeChicken(koko);
        assertThat(farm.countChicken()).isEqualTo(2);
    }

    @Test
    public void canCountChicken(){
        assertThat(farm.countChicken()).isEqualTo(3);
    }


}