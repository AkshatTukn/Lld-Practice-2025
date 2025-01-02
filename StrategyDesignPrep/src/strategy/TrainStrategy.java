package strategy;

public class TrainStrategy implements TransportationStrategy{
    private static final double COST_PER_KM = 5.0;

    @Override
    public double calculateCost(double distance) {
        return COST_PER_KM*distance;
    }
}
