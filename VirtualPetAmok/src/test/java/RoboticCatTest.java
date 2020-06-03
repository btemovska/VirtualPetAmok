import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RoboticCatTest {

    RoboticCat underTest = new RoboticCat("Lola", "roboCat", 1, 1, 1);
    Health healthUnderTest = new Health();

    @Test
    public void t1shouldReturnPetName() {
        String check = underTest.getPetName();
        assertEquals(check, "Lola");
    }

    @Test
    public void t2shouldReturnPetDescription() {
        String check = underTest.getPetDescription();
        assertEquals(check, "roboCat");
    }

    @Test
    public void t3shouldReturnHappiness() {
        int check = underTest.getHappiness();
        assertEquals(check, 1);
    }

    @Test
    public void t4shouldReturnHealth() {
        int check = underTest.getHealth();
        assertEquals(check, 1);
    }

    @Test
    public void t5shouldReturnOilLevel() {
        int check = underTest.getMaintenance();
        assertEquals(check, 1);
    }

    @Test
    public void t6shouldBeAbleToIncreasePetsHealth() {
        int healthLevelBefore = healthUnderTest.getHealthLevel();
        underTest.administerHealth(healthUnderTest);
        int healthLevelAfter = healthUnderTest.getHealthLevel();
        assertThat(healthLevelAfter - healthLevelBefore, is(3));
    }
}
