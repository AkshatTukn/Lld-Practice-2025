package strategy.context;

import strategy.TransportationStrategy;

public class TransportationContext {
    // The context class allows you to switch between different strategies at runtime.
    private TransportationStrategy transportationStrategy;
    public  void setTransportationStrategy(TransportationStrategy transportationStrategy)
    {
        this.transportationStrategy= transportationStrategy;
    }
    // Calculate the cost using the current strategy
    public double calculateCost(double distance) {
        if (transportationStrategy == null) {
            throw new IllegalStateException("Transportation strategy is not set!");
        }
        return transportationStrategy.calculateCost(distance);
    }

}
