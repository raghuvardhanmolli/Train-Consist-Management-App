import java.util.ArrayList;
import java.util.List;

public class InitializeTrainandDisplayConsistSummary {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Adding passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // Check if Sleeper exists
        boolean isSleeperPresent = passengerBogies.contains("Sleeper");

        System.out.println("\nIs 'Sleeper' bogie present? " + isSleeperPresent);

        // Final state of the list
        System.out.println("\nFinal Passenger Bogies List:");
        System.out.println(passengerBogies);

        System.out.println("\nSystem ready for further operations...");
    }
}