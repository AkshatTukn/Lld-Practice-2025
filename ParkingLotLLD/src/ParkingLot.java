import java.util.ArrayList;
import java.util.List;

public class ParkingLot implements ParkingLotInterface{
    private List<ParkingSpotInterface> parkingSpotList= new ArrayList<>();
    public ParkingLot(int compactCount, int largeCount) {
        for (int i = 0; i < compactCount; i++) {
            parkingSpotList.add(new ParkingSpot("Compact"));
        }
        for (int i = 0; i < largeCount; i++) {
            parkingSpotList.add(new ParkingSpot("Large"));
        }
    }

    @Override
    public ParkingTicketInterface parkVehicle(VehicleInterface vehicle) {
        for(ParkingSpotInterface parkingSpotInterface:parkingSpotList)
        {
            if(parkingSpotInterface.isAvailable() && parkingSpotInterface.getType().equals(vehicle.getType()))
            {
                parkingSpotInterface.assignParkingSpot(vehicle);
                return new ParkingTicket(vehicle,System.currentTimeMillis());
            }
        }
        throw  new IllegalStateException("no parking type sopt available for vehicle: "+ vehicle.getLicencePlate());
    }

    @Override
    public double unParkVehicle(ParkingTicketInterface ticket) {
        for (ParkingSpotInterface spot : parkingSpotList) {
            if (!spot.isAvailable() && spot.getVehicle() != null
                    && spot.getVehicle().getLicencePlate().equals(ticket.getVehicle().getLicencePlate())) {

                spot.removeVehicle(); // Clear the parking spot
                ticket.setExitTime(System.currentTimeMillis()); // Set exit time on ticket

                // Calculate and return the parking fee
                return FeeCalculator.calculateFee(ticket);
            }
        }
        throw new IllegalStateException("Vehicle not found in the lot!");
    }

    @Override
    public List<ParkingSpotInterface> getAvailableSpots() {
        List<ParkingSpotInterface> availableSpots = new ArrayList<>();
        for (ParkingSpotInterface spot : parkingSpotList) {
            if (spot.isAvailable()) {
                availableSpots.add(spot);
            }
        }
        return availableSpots;
    }
}
