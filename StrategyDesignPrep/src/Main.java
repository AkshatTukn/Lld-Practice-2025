import strategy.BusStrategy;
import strategy.CarStrategy;
import strategy.TrainStrategy;
import strategy.context.TransportationContext;

public class Main {
    public static void main(String[] args) {
        TransportationContext context = new TransportationContext();

        // Calculate cost using Car
        context.setTransportationStrategy(new CarStrategy());
        System.out.println("Car cost for 50 km: ₹" + context.calculateCost(50));

        // Calculate cost using Bus
        context.setTransportationStrategy(new BusStrategy());
        System.out.println("Bus cost for 30 km: ₹" + context.calculateCost(30));

        // Calculate cost using Train
        context.setTransportationStrategy(new TrainStrategy());
        System.out.println("Train cost for 120 km: ₹" + context.calculateCost(120));
    }
}