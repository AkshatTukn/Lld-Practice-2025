public class Vehicle implements VehicleInterface{
    private String type;
    private String licensePlate;

    public Vehicle(String type, String licensePlate) {
        this.type = type;
        this.licensePlate = licensePlate;
    }


    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getLicencePlate() {
        return this.licensePlate;
    }
}
