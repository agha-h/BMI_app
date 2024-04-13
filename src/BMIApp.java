import java.util.Scanner;

// BMIApp.java (Driver Class)
public class BMIApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of MyBMI class references
        MyBMI[] bmiList = new MyBMI[6];

        // Take input for objects using the Imperial system
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for person using Imperial system:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Weight (in kg): ");
            double weight = scanner.nextDouble();
            System.out.print("Height - Feet: ");
            int feet = scanner.nextInt();
            System.out.print("Height - Inches: ");
            int inches = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            bmiList[i] = new ImperialUnit(name, weight, feet, inches);
        }

        // Take input for objects using the Metric system
        for (int i = 3; i < 6; i++) {
            System.out.println("Enter details for person using Metric system:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Weight (in kg): ");
            double weight = scanner.nextDouble();
            System.out.print("Height (in cm): ");
            double heightInCm = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            bmiList[i] = new MetricUnit(name, weight, heightInCm);
        }

        // Loop to display details of all objects
        for (MyBMI bmi : bmiList) {
            System.out.println(bmi.toString());
        }

        // Close the scanner
        scanner.close();
    }
}
