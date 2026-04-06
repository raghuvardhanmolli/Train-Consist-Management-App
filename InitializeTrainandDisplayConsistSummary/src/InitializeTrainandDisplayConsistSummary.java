import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (Custom Object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class InitializeTrainandDisplayConsistSummary {

    public static void main(String[] args) {

        // Creating list of bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Adding passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 40));

        System.out.println("=== Before Sorting ===");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Sorting using Comparator (by capacity)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\n=== After Sorting (Ascending Capacity) ===");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Optional: Descending order
        bogieList.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\n=== After Sorting (Descending Capacity) ===");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}