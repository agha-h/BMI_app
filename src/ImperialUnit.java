// ImperialUnit.java (Subclass)
public class ImperialUnit extends MyBMI {
    private int feet;
    private int inches;

    // Default constructor
    public ImperialUnit() {
        super();
    }

    // Parameterized constructor
    public ImperialUnit(String name, double weight, int feet, int inches) {
        super(name, weight);
        this.feet = feet;
        this.inches = inches;
    }

    // Accessor and mutator methods for feet and inches
    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    // Override calculateBMI method
    @Override
    public double calculateBMI() {
        // Implement BMI calculation using the Imperial system
        // BMI = (weight in kg) / (height in meters * height in meters)
        double heightInMeters = ((feet * 12) + inches) * 0.0254;
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
        // Include name, weight, height in feet and inches, BMI value, and BMI analysis
        // Format numbers with 2 decimal points
        return String.format("Name: %s\nWeight: %.2f kg\nHeight: %d feet %d inches\nBMI: %.2f\nAnalysis: %s\n",
                getName(), getWeight(), getFeet(), getInches(), calculateBMI(), analyzeBMI());
    }
}
