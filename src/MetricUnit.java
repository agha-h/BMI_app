// MetricUnit.java (Subclass)
public class MetricUnit extends MyBMI {
    private double heightInCm;

    // Default constructor
    public MetricUnit() {
        super();
    }

    // Parameterized constructor
    public MetricUnit(String name, double weight, double heightInCm) {
        super(name, weight);
        this.heightInCm = heightInCm;
    }

    // Accessor and mutator methods for heightInCm
    public double getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(double heightInCm) {
        this.heightInCm = heightInCm;
    }

    // Override calculateBMI method
    @Override
    public double calculateBMI() {
        // Implement BMI calculation using the Metric system
        // BMI = (weight in kg) / (height in meters * height in meters)
        double heightInMeters = heightInCm / 100;
        return getWeight() / (heightInMeters * heightInMeters);
    }

    // Override analyzeBMI method
    @Override
    public String analyzeBMI() {
        // Implement BMI analysis based on your criteria
        // Return a string indicating whether the person is underweight, overweight, or
        // has normal weight
        double bmiValue = calculateBMI();

        if (bmiValue < MyBMI.BMI_UNDERWEIGHT) {
            return "Underweight";
        } else if (bmiValue >= MyBMI.BMI_UNDERWEIGHT && bmiValue < MyBMI.BMI_OVERWEIGHT) {
            return "Normal weight";
        } else {
            return "Overweight";
        }
    }

    // Override toString method
    @Override
    public String toString() {
        // Return a string with details about the object
        // Include name, weight, height in centimeters, BMI value, and BMI analysis
        // Format numbers with 2 decimal points
        return String.format("Name: %s\nWeight: %.2f kg\nHeight: %.2f cm\nBMI: %.2f\nAnalysis: %s\n",
                getName(), getWeight(), getHeightInCm(), calculateBMI(), analyzeBMI());
    }
}
