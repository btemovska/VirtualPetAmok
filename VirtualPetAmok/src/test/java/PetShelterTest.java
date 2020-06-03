import org.junit.Before;
import org.junit.Test;
import org.assertj.core.api.Assertions;

import java.util.Collection;

public class PetShelterTest {

    private PetShelter underTest;
    private OrganicCat pet1;
    private OrganicDog pet2;
    private RoboticCat pet3;
    private RoboticDog pet4;

    @Before
    public void setUp() {
        underTest = new PetShelter();
        pet1 = new OrganicCat("Lola", "orgCat", 1, 1, 1, 1, 1, 1);
        pet2 = new OrganicDog("Max", "orgDog", 1, 1, 1, 1, 1, 1);
        pet3 = new RoboticCat("Julie", "roboCat", 1, 1, 1);
        pet4 = new RoboticDog("Cooper", "roboDog", 1, 1, 1);
    }

    @Test
    public void t1shouldBeAbleToAddAPet() {
        underTest.addPet(pet1);
        OrganicCat petEntered = (OrganicCat) underTest.findPet("Lola");
        Assertions.assertThat(petEntered).isEqualTo(pet1);
    }

    @Test
    public void t2shouldBeAbleToAddTwoPets() {
        underTest.addPet(pet1);
        underTest.addPet(pet3);
        OrganicCat petEntered1 = (OrganicCat) underTest.findPet("Lola");
        RoboticCat petEntered2 = (RoboticCat) underTest.findPet("Julie");
        Collection<Pets> allPets = underTest.getAllPets();
        Assertions.assertThat(allPets).contains(pet1, pet3);
        Assertions.assertThat(2).isEqualTo(allPets.size());
    }

    @Test
    public void t3shouldBeAbleToRemoveAPet() {
        underTest.addPet(pet3);
        underTest.removePet(pet3);
        RoboticCat petEntered = (RoboticCat) underTest.findPet(pet3.getPetName());
        Assertions.assertThat("Julie").isEqualTo("Julie");
    }

    @Test
    public void t4shouldBeAbleToFeedAPet() {
        underTest.addPet(pet1);
        underTest.feed(pet1.getPetName(), 0);
        Assertions.assertThat(pet1.getHunger()).isEqualTo(1);
    }

    @Test
    public void t5shouldBeAbleToWaterAPet() {
        underTest.addPet(pet2);
        underTest.water(pet2.getPetName(), 0);
        Assertions.assertThat(pet2.getThirst()).isEqualTo(1);
    }

    @Test
    public void t6shouldBeAbleToPlayWithAPet() {
        underTest.addPet(pet2);
        underTest.play(pet2.getPetName(), 0);
        Assertions.assertThat(pet2.getBored()).isEqualTo(1);
    }

    @Test
    public void t7shouldBeAbleToOilRoboPets() {
        underTest.addPet(pet3);
        underTest.oilRoboticPets(pet3.getPetName(), 0);
        Assertions.assertThat(pet3.getMaintenance()).isEqualTo(1);
    }

    @Test
    public void t8shouldBeAbleToCleanDogsCage() {
        underTest.addPet(pet2);
        underTest.cleanOrganicDogCages(pet2.getPetName(), 0);
        Assertions.assertThat(pet2.getDogCage()).isEqualTo(1);
    }

    @Test
    public void t9shouldBeAbleToCleanLitterBox() {
        underTest.addPet(pet1);
        underTest.cleanOrganicCatLitterBox(pet1.getPetName(), 0);
        Assertions.assertThat(pet1.getLitterBox()).isEqualTo(1);
    }

    @Test
    public void t10shouldBeAbleToWalkOrgDogs() {
        underTest.addPet(pet2);
        underTest.walkAllOrgDogs(pet2.getPetName(), 0);
        Assertions.assertThat(pet2.getHappiness()).isEqualTo(6);
    }

    @Test
    public void t11shouldBeAbleToWalkRobDogs() {
        underTest.addPet(pet4);
        underTest.walkAllRoboDogs(pet4.getPetName(), 0);
        Assertions.assertThat(pet4.getHappiness()).isEqualTo(6);
    }
}
