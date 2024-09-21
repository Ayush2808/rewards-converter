public class RewardValue {
    private double cashValue;
    private static final double MILES_CONVERSION_RATE = 1.5; // Define a conversion rate, e.g., $1 = 1.5 miles

    // Constructor to initialize the cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Method to calculate the miles value
    public double getMilesValue() {
        return cashValue * MILES_CONVERSION_RATE; // Conversion logic
    }
}

