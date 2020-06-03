public class OrganicDog extends OrganicPets implements Walking {

    public int dogCage;

    public OrganicDog(String petName, String petDescription, int happiness, int health, int hunger, int thirst,
                      int bored, int soilDogCage) {
        super(petName, petDescription, happiness, health, hunger, thirst, bored);
        this.dogCage = soilDogCage;
    }

    public int getDogCage() {
        return dogCage;
    }

    public void cleanDogCage(int amount) {
        happiness += amount;
    }

    @Override
    public void walking() {
        happiness += 5;
    }

    public void administerHealth(Health health) {
        health.receiveHealth(3);
    }

}
