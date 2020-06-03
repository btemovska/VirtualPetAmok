public abstract class OrganicPets extends Pets {

    private int hunger;
    private int thirst;
    private int bored;

    public OrganicPets(String petName, String petDescription, int happiness, int health, int hunger, int thirst, int bored) {
        super(petName, petDescription, happiness, health);
        this.hunger = hunger;
        this.thirst = thirst;
        this.bored = bored;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBored() {
        return bored;
    }

    public void feed(int amount) {
        hunger -= amount;
        happiness += 1;
        health += 2;
    }

    public void water(int amount) {
        thirst -= amount;
        happiness += 1;
        health += 2;
    }

    public void play(int amount) {
        bored -= amount;
        happiness += 5;
        health += 2;
    }

    @Override
    public String toString() {
        return petName + "\t" + petDescription + "\t\t" + happiness + "\t\t" + health
                + "\t\t" + hunger + "\t\t" + thirst + "\t\t" + bored;
    }
}
