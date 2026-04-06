import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Reusing Bogie class from UC7
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class InitializeTrainandDisplayConsistSummary {

    public static void main(String[] args) {

        // Original bogie list
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 40));

        System.out.println("=== Original Bogie List ===");
        bogieList.forEach(Bogie::display);

        // Stream filtering: capacity > 60
        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\n=== Filtered Bogies (Capacity > 60) ===");
        filteredBogies.forEach(Bogie::display);

        // Verify original list unchanged
        System.out.println("\n=== Original List After Filtering (Unchanged) ===");
        bogieList.forEach(Bogie::display);
    }
}