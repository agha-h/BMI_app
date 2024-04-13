// MyBMI.java (Abstract Class)
public abstract class MyBMI {
    private String name;
    private double weight;

    // Constants for BMI ranges
    public static final double BMI_UNDERWEIGHT = 18.5;
    public static final double BMI_OVERWEIGHT = 25.0;

    // Default constructor
    public MyBMI() {
    }

    // Parameterized constructor
    public MyBMI(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // Accessor and mutator methods for name and weight
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Abstract method for calculating BMI
    public abstract double calculateBMI();

    // Abstract method for BMI analysis
    public abstract String analyzeBMI();

    // Abstract method for displaying details
    public abstract String toString();
}
