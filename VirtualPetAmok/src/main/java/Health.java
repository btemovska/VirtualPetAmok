public class Health {

    private static final int DEFAULT_HEALTH_LEVEL = 10;
    private int healthLevel = DEFAULT_HEALTH_LEVEL;

    public int getHealthLevel() {
        return healthLevel;
    }

    public void receiveHealth(int amount) {
        healthLevel += amount;
    }
}
