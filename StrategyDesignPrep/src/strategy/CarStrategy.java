package strategy;

public class CarStrategy implements TransportationStrategy{
    private static final double COST_PER_KM = 15.0;

    @Override
    public double calculateCost(double distance) {
        return COST_PER_KM*distance;
    }
}
