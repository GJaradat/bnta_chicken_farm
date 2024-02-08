import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FarmerTest {

    Farmer farmer;

    @BeforeEach
    public void setUp() {
        farmer = new Farmer("Kolyo");
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
}
