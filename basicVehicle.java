package lab10;

abstract class basicVehicle implements Vehicle {
    protected int noOfWheels;
    protected int noOfSeats;
    protected int noOfDoors;
    protected String type;
    
    public basicVehicle(int noOfWheels, int noOfSeats, int noOfDoors, String type) {
        this.noOfWheels = noOfWheels;
        this.noOfSeats = noOfSeats;
        this.noOfDoors = noOfDoors;
        this.type = type;
    }
    
    public int getNumberOfDoors() {
        return noOfDoors;
    }
    
    @Override
    public int getNumberOfSeats() {
        return noOfSeats;
    }
    
    @Override
    public int getNumberOfWheels() {
        return noOfWheels;
    }
    
    @Override
    public String getVehicleType() {
        return type;
    }
    
    @Override
    public String toString() {
        return "Type: " + type + "\n" +
               "# Of Wheels: " + noOfWheels + "\n" +
               "# of Seats: " + noOfSeats + "\n" +
               "# of Doors: " + noOfDoors;
    }
}