public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lexus IS 300", 220,"Бензин",4,Color.GOLD);

        car.driving("Джалал-Абад");
        car.driving(3, "Ош");

        Truck truck = new Truck("ЗИЛ-130",100,"бензин",3,Color.BLUE,6000);

        truck.driving("Талас");

        Truck truck1 = new Truck("Hyundai Porter",160,"дизель",2,Color.BLUE,950);

        truck1.driving("Баткен");

        System.out.println("Name: " + car.getName() + "\t Max speed: " + car.getMaxSpeed() + "\t Fuel: " + car.getFuel() + "\t Color: " + car.getColor() + "\t Passenger capacity: " + car.getPassengerCapacity());
        System.out.println("Name: " + truck.getName() + "\t Max speed: " + truck.getMaxSpeed() + "\t Fuel: " + truck.getFuel() + "\t Color: " + truck.getColor() + "\t Passenger capacity: " + truck.getPassengerCapacity() + "\t Load capacity: " + truck.getLoadCapacity() + " kg");
        System.out.println("Name: " + truck1.getName() + "\t Max speed: " + truck1.getMaxSpeed() + "\t Fuel: " + truck1.getFuel() + "\t Color: " + truck1.getColor() + "\t Passenger capacity: " + truck1.getPassengerCapacity() + "\t Load capacity: " + truck1.getLoadCapacity() + " kg");

    }
}