import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class OrganicDogTest {

    OrganicDog underTest = new OrganicDog("Max", "orgDog", 1, 1, 1, 1, 1, 1);
    Health healthUnderTest = new Health();

    @Test
    public void t1shouldReturnPetName() {
        String check = underTest.getPetName();
        assertEquals(check, "Max");
    }

    @Test
    public void t2shouldReturnPetDescription() {
        String check = underTest.getPetDescription();
        assertEquals(check, "orgDog");
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
    public void t5shouldReturnHunger() {
        int check = underTest.getHunger();
        assertEquals(check, 1);
    }

    @Test
    public void t6shouldReturnThirst() {
        int check = underTest.getThirst();
        assertEquals(check, 1);
    }

    @Test
    public void t7shouldReturnBored() {
        int check = underTest.getBored();
        assertEquals(check, 1);
    }

    @Test
    public void t8shouldReturnSoilDogCage() {
        int check = underTest.getBored();
        assertEquals(check, 1);
    }

    @Test
    public void t9shouldBeAbleToIncreasePetsHealth() {
        int healthLevelBefore = healthUnderTest.getHealthLevel();
        underTest.administerHealth(healthUnderTest);
        int healthLevelAfter = healthUnderTest.getHealthLevel();
        assertThat(healthLevelAfter - healthLevelBefore, is(3));
    }
}
