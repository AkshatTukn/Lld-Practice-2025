public class ParkingSpot implements ParkingSpotInterface{
    private boolean isAvailable;
    private String type;
    private VehicleInterface vehicleInterface;

    public ParkingSpot(String type) {
        this.isAvailable = true;
        this.type = type;
    }

    @Override
    public boolean isAvailable() {
        return this.isAvailable;
    }

    @Override
    public String getType() {
        return this.getType();
    }

    @Override
    public void assignParkingSpot(VehicleInterface vehicleInterface) {
        this.isAvailable=false;
        this.vehicleInterface =vehicleInterface;

    }

    @Override
    public void removeVehicle() {
       this.isAvailable= true;
       this.vehicleInterface=null;
    }

    @Override
    public VehicleInterface getVehicle() {
        return vehicleInterface;
    }
}
