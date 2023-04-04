public final class Truck extends Car{
    private int loadCapacity; //Грузоподъемность.

    public Truck(String name, int maxSpeed, String fuel, int passengerCapacity, Color color, int loadCapacity) {
        super(name, maxSpeed, fuel, passengerCapacity, color);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void driving(String locality) {
        System.out.println("Грузовик " + this.getName() + " доставил груз в " + locality);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
