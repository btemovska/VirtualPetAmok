public class OrganicCat extends OrganicPets {

    public int litterBox;

    public OrganicCat(String petName, String petDescription, int happiness, int health, int hunger, int thirst,
                      int bored, int litterBox) {
        super(petName, petDescription, happiness, health, hunger, thirst, bored);
        this.litterBox = litterBox;
    }

    public int getLitterBox() {
        return litterBox;
    }

    public void cleanLitterBox(int amount) {
        happiness += amount;
    }

    public void administerHealth(Health health) {
        health.receiveHealth(3);
    }

}
