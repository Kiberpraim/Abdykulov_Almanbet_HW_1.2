public class Car extends Transport {
    private String name;
    private int passengerCapacity; //Пассажировместимость.
    private Color color;

    public Car(String name, int maxSpeed, String fuel, int passengerCapacity, Color color) {
        super(maxSpeed, fuel);
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.color = color;
    }

    public void driving(String locality){
        System.out.println("Машина " + name + " едет в " + locality);
    }

    public final void driving(int number, String locality){
        System.out.println(name + " объехал " + locality + " " + number +  " раза.");
    }

    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public Color getColor() {
        return color;
    }
}
