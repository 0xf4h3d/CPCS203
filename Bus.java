package lab10;

class Bus extends basicVehicle {
    private String driverName;
    
    public Bus(int noOfWheels, int noOfSeats, int noOfDoors, String type, String driverFName, String driverLName) {
        super(noOfWheels, noOfSeats, noOfDoors, type);
        setDriverName(driverFName, driverLName);
    }
    
    private void setDriverName(String driverFName, String driverLName) {
        this.driverName = driverFName.toUpperCase() + " " + driverLName;
    }
    
    public String getDriverName() {
        return driverName;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Driver: " + driverName;
    }
}