public class Transport {
    private int maxSpeed;
    private String fuel;

    public Transport(int maxSpeed, String fuel) {
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }
}
