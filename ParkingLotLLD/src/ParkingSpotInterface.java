public interface ParkingSpotInterface {
    boolean isAvailable();
    String getType();
    void assignParkingSpot(VehicleInterface vehicleInterface);
    void removeVehicle();

    VehicleInterface getVehicle();
}
