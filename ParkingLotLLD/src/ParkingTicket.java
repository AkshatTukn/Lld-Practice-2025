public class ParkingTicket implements ParkingTicketInterface{
    private VehicleInterface vehicle;
    private long entryTime;
    private long exitTime;

    private String parkingTicket;

    public ParkingTicket(VehicleInterface vehicle, long entryTime) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.parkingTicket = vehicle.getLicencePlate() + entryTime;
    }

    @Override
    public VehicleInterface getVehicle() {
        return vehicle;
    }

    @Override
    public long getEntryTime() {
        return entryTime;
    }

    @Override
    public long getExitTime() {
        return exitTime;
    }

    @Override
    public void setExitTime(long exitTime) {
        this.exitTime= exitTime;

    }
}
