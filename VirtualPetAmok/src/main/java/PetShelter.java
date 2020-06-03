import java.awt.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {

    Map<String, Pets> shelter = new HashMap<>();
    Map<String, OrganicPets> orgShelter = new HashMap<>();
    Map<String, RoboticPets> roboShelter = new HashMap<>();

    public Pets findPet(String petName) {
        return shelter.get(petName);
    }

    public void addPet(Pets pet) {
        shelter.put(pet.getPetName(), pet);
    }

    public void removePet(Pets pet) {
        shelter.remove(pet.getPetName(), pet);
    }

    public Collection<Pets> getAllPets() {
        return shelter.values();
    }

    public void feed(String petName, int amount) {
        OrganicPets feedPet = (OrganicPets) findPet(petName);
        feedPet.feed(amount);
    }

    public void water(String petName, int amount) {
        OrganicPets waterPet = (OrganicPets) findPet(petName);
        waterPet.water(amount);
    }

    public void play(String petName, int amount) {
        OrganicPets playPet = (OrganicPets) findPet(petName);
        playPet.play(amount);
    }

    public void showAllPets() { //organic and robotic ALL
        for (Map.Entry<String, Pets> entry : shelter.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void showAllDogs() {
        for (Pets pet : shelter.values()) {
            if (pet instanceof Walking) {
                System.out.println(pet);
            }
        }
    }

    public void oilRoboticPets(String petName, int amount) {
        RoboticPets oilPet = (RoboticPets) findPet(petName);
        oilPet.oilRoboPets(amount);
    }

    public void cleanOrganicDogCages(String petName, int amount) {
        OrganicDog cleanDog = (OrganicDog) findPet(petName);
        cleanDog.cleanDogCage(amount);
    }

    public void cleanOrganicCatLitterBox(String petName, int amount) {
        OrganicCat cleanCat = (OrganicCat) findPet(petName);
        cleanCat.cleanLitterBox(amount);
    }

    public void walkAllOrgDogs(String petName, int amount) {
        OrganicDog walkOrgDogs = (OrganicDog) findPet(petName);
        walkOrgDogs.walking();
    }

    public void walkAllRoboDogs(String petName, int amount) {
        RoboticDog walkRoboDogs = (RoboticDog) findPet(petName);
        walkRoboDogs.walking();
    }
}
