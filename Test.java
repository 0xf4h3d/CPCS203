package lab10;

public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car(4, 5, 2, "Car");
        Vehicle bus = new Bus(35, 6, 4, "Bus", "Bob", "Smith");
        
        System.out.println(car.toString());
        System.out.println();
        System.out.println(bus.toString());
    }
}
