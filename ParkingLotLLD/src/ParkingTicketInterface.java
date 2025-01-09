public interface ParkingTicketInterface {
    VehicleInterface getVehicle();
    long getEntryTime();
    long getExitTime();
    void setExitTime(long exitTime);
}
