import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InitializeTrainandDisplayConsistSummary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creating HashMap to store bogie and capacity
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("=== Train Consist Management System ===");
        System.out.print("Enter number of bogies to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bogie Name: ");
            String bogieName = scanner.nextLine();

            System.out.print("Enter Capacity: ");
            int capacity = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Insert into HashMap
            bogieCapacityMap.put(bogieName, capacity);
        }

        // Displaying bogie-capacity mapping
        System.out.println("\n=== Bogie Capacity Details ===");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        scanner.close();
    }
}