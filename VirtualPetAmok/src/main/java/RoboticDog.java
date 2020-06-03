public class RoboticDog extends RoboticPets implements Walking {

    public RoboticDog(String petName, String petDescription, int happiness, int health, int maintenance) {
        super(petName, petDescription, happiness, health, maintenance);
    }

    @Override
    public void walking() {
        happiness += 5;
    }

    public void administerHealth(Health health) {
        health.receiveHealth(3);
    }
}
