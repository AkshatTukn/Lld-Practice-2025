class FeeCalculator {
    private static final double RATE_PER_HOUR = 10.0;

    public static double calculateFee(ParkingTicketInterface ticket) {
        long duration = (ticket.getExitTime() - ticket.getEntryTime()) / (1000 * 60 * 60); // Convert to hours
        return Math.max(1, duration) * RATE_PER_HOUR; // At least 1 hour fee
    }
}