import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChickenTest {

    Chicken chick;

    @BeforeEach
    public void setUp() {
        chick = new Chicken("Koko", 5);
    }

    //GETTER SETTER TEST SUITE
    @Test
    public void hasName(){
        assertThat(chick.getName()).isEqualTo("Koko");
    }

        @Test
    public void canSetName(){
        chick.setName("Marta");
        assertThat(chick.getName()).isEqualTo("Marta");
    }

        @Test
    public void hasEggs(){
        assertThat(chick.getEggs()).isEqualTo(5);
    }

        @Test
    public void canSetEggs(){
        chick.setEggs(10);
        assertThat(chick.getEggs()).isEqualTo(10);
    }

    //METHODS
}
