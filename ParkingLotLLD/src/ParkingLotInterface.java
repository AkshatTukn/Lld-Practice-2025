import java.util.List;

public interface ParkingLotInterface {

    ParkingTicketInterface parkVehicle(VehicleInterface vehicle);

    double unParkVehicle(ParkingTicketInterface ticket);

    List<ParkingSpotInterface> getAvailableSpots();


}
