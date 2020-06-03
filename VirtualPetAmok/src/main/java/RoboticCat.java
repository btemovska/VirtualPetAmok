public class RoboticCat extends RoboticPets {


    public RoboticCat(String petName, String petDescription, int happiness, int health, int maintenance) {
        super(petName, petDescription, happiness, health, maintenance);
    }

    public void administerHealth(Health health) {
        health.receiveHealth(3);
    }
}
